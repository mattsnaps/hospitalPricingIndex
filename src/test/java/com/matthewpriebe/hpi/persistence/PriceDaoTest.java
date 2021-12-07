package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.PriceId;
import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.util.Database;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * The type Price dao test.
 */
@Log4j2
public class PriceDaoTest {


    GenericDao daoPrice;

    GenericDao daoHospital;

    GenericDao daoProcedure;

    /**
     * Sets up.
     * resets the database.
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        daoPrice = new GenericDao<>(Price.class);
        daoHospital = new GenericDao<>(Hospital.class);
        daoProcedure = new GenericDao<>(Procedure.class);
    }

    /**
     * Gets all prices from all procedures from all hospitals.
     */
    @Test
    void getAllSuccess() {

    }

    /**
     * Gets by id success. Verify one procedure from one hospital at one price.
     */
    @Test
    void getByIdSuccess() {

    }

    /**
     * Insert a new hospital with existing procedure.
     */
    @Test
    void insertSuccess() {

    }

    /**
     * Update success price of a procedure from one hospital.
     */
    @Test
    void updateSuccess() {

    }


    /**
     * Delete procedure from a hospital with price.
     */
    @Test
    void delete() {
       
    }
}
