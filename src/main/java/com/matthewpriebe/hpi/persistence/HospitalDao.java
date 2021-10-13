package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import lombok.extern.log4j.Log4j2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The type Hospital dao.
 */
@Log4j2
public class HospitalDao {

    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public Hospital getById(int id) {
        Session session = sessionFactory.openSession();
        Hospital Hospital = session.get(Hospital.class, id);
        session.close();
        return Hospital;
    }


    /**
     * Save or update.
     *
     * @param Hospital the hospital
     */
    public void saveOrUpdate(Hospital Hospital) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(Hospital);
        transaction.commit();
        session.close();
    }

    /**
     * Insert int.
     *
     * @param Hospital the hospital
     * @return the int
     */
    public int insert(Hospital Hospital) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(Hospital);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete.
     *
     * @param Hospital the hospital
     */
    public void delete(Hospital Hospital) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session. delete(Hospital);
        transaction.commit();
        session.close();
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    public List<Hospital> getAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Hospital> query = builder.createQuery(Hospital.class);
        Root<Hospital> root = query.from(Hospital.class);
        List<Hospital> hospitals = session.createQuery(query).getResultList();
        session.close();
        return hospitals;
    }
}
