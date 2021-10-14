package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.PriceId;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * The type Price dao.
 */
@Log4j2
public class PriceDao {

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
    public Price getById(PriceId id) {
        Session session = sessionFactory.openSession();
        Price Price = session.get( Price.class, id );
        session.close();
        return Price;
    }


    /**
     * Save or update.
     *
     * @param Price the hospital procedure price
     */
    public void saveOrUpdate(Price Price) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(Price);
        transaction.commit();
        session.close();
    }


    /**
     * Insert int.
     *
     * @param Price the hospital procedure price
     * @return the int
     */
    public PriceId insert(Price Price) {
        PriceId id;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (PriceId)session.save(Price);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete.
     *
     * @param Price the hospital procedure price
     */
    public void delete(Price Price) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session. delete(Price);
        transaction.commit();
        session.close();
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    public List<Price> getAll() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Price> query = builder.createQuery(Price.class);
        Root<Price> root = query.from(Price.class);
        List<Price> prices = session.createQuery(query).getResultList();
        session.close();
        return prices;
    }

}
