package com.udemy.MicroserviceCourseManagement.repository;

import com.udemy.MicroserviceCourseManagement.model.IModel;
import org.hibernate.Session;

import java.util.List;

public interface IGenericDao<T extends IModel> {
    T find(String id);

    List<T> findAll();

    void save(T entity);

    T update(T entity);

    void delete(Long id);

    Session getSession();
}
