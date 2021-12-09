package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.PriceId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PriceDao {

    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public Price getById(PriceId id) {
        Session session = sessionFactory.openSession();

        Price Price = session.get(Price.class, id );
        session.close();
        return Price;
    }

}
