package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.PriceId;
import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.util.Database;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Hospital dao test.
 */
@Log4j2
public class HospitalDaoTest {

    /**
     * The Dao.
     */
    /**
     * The Dao procedure.
     */
    GenericDao daoProcedure;
    /**
     * The Dao price.
     */
    PriceDao daoPrice;
    /**
     *
     */
    GenericDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new GenericDao<>(Hospital.class);
        daoProcedure = new GenericDao<>(Procedure.class);
        daoPrice = new PriceDao();
    }

    /**
     * Verify successful retrieval of a Hospital
     */
    @Test
    void getByIdSuccess() {

    }

    /**
     * Verify successful retrieval of all Hospitals
     */
    @Test
    void getAllSuccess() {

    }

    /**
     * Insert hospital success test.
     */
    @Test
    void insertHospitalSuccess() {

    }


    /**
     * Update Hospital success.
     */
    @Test
    void updateSuccess() {


    }

    /**
     * Delete Hospital success. Cascade delete works down to child tables.
     */
    @Test
    void deleteSuccess() {

    }
}
