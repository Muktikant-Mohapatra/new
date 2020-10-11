package com.udemy.MicroserviceCourseManagement.repository;

import com.udemy.MicroserviceCourseManagement.model.IModel;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class AbstractGenericDao<T extends IModel> implements IGenericDao<T> {
    @PersistenceContext
    protected EntityManager em;
    protected Class<T> entityClass =
            (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    @Override
    public T find(String id) {
        return em.find(entityClass, id);
    }

    @Override
    public List<T> findAll() {
        final List<T> resultList =
                this.em.createQuery("Select v from " + this.entityClass.getCanonicalName() + " v").getResultList();
        return resultList;
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public T update(T entity) {
        return em.merge(entity);
    }

    @Override
    public void delete(final Long id) {
        em.remove(em.getReference(entityClass, id));
    }

    @Override
    public Session getSession() {
        return (Session) this.em.getDelegate();
    }
}
