package com.udemy.Microservicelogservice.service;

import com.udemy.Microservicelogservice.model.Log;
import com.udemy.Microservicelogservice.model.Summary;
import com.udemy.Microservicelogservice.repository.LogRepository;
import com.udemy.Microservicelogservice.repository.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogRepository logRepository;
    @Autowired
    private SummaryRepository summaryRepository;

    @Override
    public Log saveOrUpdate(Log log) {
        //Find summary of the course
        Optional<Summary> summary = summaryRepository.findByCourseId(log.getCourseId());
        Summary existSummary = summary.get();
        if (existSummary != null) {
            //if existed then delete the summary
            summaryRepository.delete(existSummary);
            //Increase the hit count to +1
            existSummary.setHitCount(existSummary.getHitCount() + 1);
            //Save the updated course summary
            summaryRepository.save(existSummary);
        } else {
            //If not existed then create a new summary for the course
            Summary newSummary = new Summary();
            newSummary.setCourseId(log.getCourseId());
            newSummary.setHitCount(1l);
            //Save new Summary for the course
            summaryRepository.save(newSummary);
        }
        //save the log
        logRepository.save(log);
        return log;
    }

    @Override
    public List<Summary> findAllPopularCourse() {
        return summaryRepository.findAllPopularCourse();
    }

    @Override
    public Summary findSummaryByCourseId(String courseId) {
        Optional<Summary> courseSummary = summaryRepository.findByCourseId(courseId);

        return courseSummary.get();
    }
}
