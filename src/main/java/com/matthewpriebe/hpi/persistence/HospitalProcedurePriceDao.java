package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.HospitalProcedurePrice;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The type Hospital procedure price dao.
 */
@Log4j2
public class  HospitalProcedurePriceDao{

    /**
     * The Session factory.
     */
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();


    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public HospitalProcedurePrice getById(int id) {
        Session session = sessionFactory.openSession();
        HospitalProcedurePrice HospitalProcedurePrice = session.get( HospitalProcedurePrice.class, id );
        session.close();
        return HospitalProcedurePrice;
    }


    /**
     * Save or update.
     *
     * @param HospitalProcedurePrice the hospital procedure price
     */
    public void saveOrUpdate(HospitalProcedurePrice HospitalProcedurePrice) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(HospitalProcedurePrice);
        transaction.commit();
        session.close();
    }


    /**
     * Insert int.
     *
     * @param HospitalProcedurePrice the hospital procedure price
     * @return the int
     */
    public int insert(HospitalProcedurePrice HospitalProcedurePrice) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(HospitalProcedurePrice);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete.
     *
     * @param HospitalProcedurePrice the hospital procedure price
     */
    public void delete(HospitalProcedurePrice HospitalProcedurePrice) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session. delete(HospitalProcedurePrice);
        transaction.commit();
        session.close();
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    public List<HospitalProcedurePrice> getAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<HospitalProcedurePrice> query = builder.createQuery(HospitalProcedurePrice.class);
        Root<HospitalProcedurePrice> root = query.from(HospitalProcedurePrice.class);
        List<HospitalProcedurePrice> hospitalProcedurePrices = session.createQuery(query).getResultList();
        session.close();
        return hospitalProcedurePrices;
    }

}
