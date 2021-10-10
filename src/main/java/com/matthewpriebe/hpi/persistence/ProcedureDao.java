package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Procedure;
import lombok.extern.log4j.Log4j2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The type Procedure dao.
 */
@Log4j2
public class ProcedureDao {

    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public Procedure getById(int id) {
        Session session = sessionFactory.openSession();
        Procedure Procedure = session.get(Procedure.class, id );
        session.close();
        return Procedure;
    }

    /**
     * Save or update.
     *
     * @param Procedure the procedure
     */
    public void saveOrUpdate(Procedure Procedure) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(Procedure);
        transaction.commit();
        session.close();
    }

    /**
     * Insert int.
     *
     * @param Procedure the procedure
     * @return the int
     */
    public int insert(Procedure Procedure) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(Procedure);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete.
     *
     * @param Procedure the procedure
     */
    public void delete(Procedure Procedure) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session. delete(Procedure);
        transaction.commit();
        session.close();
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    public List<Procedure> getAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Procedure> query = builder.createQuery(Procedure.class);
        Root<Procedure> root = query.from(Procedure.class);
        List<Procedure> procedures = session.createQuery(query).getResultList();
        session.close();
        return procedures;
    }
}
