package com.udemy.MicroserviceCourseManagement.repository;

import com.udemy.MicroserviceCourseManagement.model.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Transactional
@Repository
public class TransactionRepositoryImpl extends AbstractGenericDao<Transaction> implements TransactionRepository {
    @Override
    public List<Transaction> findAllTransactionOfUser(final String userId) {
        String hql = "select t from Transaction t where t.userId=:pUserId";
        Query query = em.createQuery(hql);
        query.setParameter("pUserId", userId);
        return query.getResultList();
    }

    @Override
    public List<Transaction> findAllTransactionOfCourse(final String courseId) {
        String hql = "select t from Transaction t from t.Course.id=:pCourseId";
        Query query = em.createQuery(hql);
        query.setParameter("pCourseId", courseId);
        return query.getResultList();
    }

}
