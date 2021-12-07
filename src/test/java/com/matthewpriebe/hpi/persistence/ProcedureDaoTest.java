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
 * The type Procedure dao test.
 */
@Log4j2
public class ProcedureDaoTest {

    GenericDao dao;
    GenericDao daoHospital;
    PriceDao daoPrice;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        daoHospital = new GenericDao<>(Hospital.class);

        dao = new GenericDao<>(Procedure.class);

        daoPrice = new PriceDao();
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess() {
        Procedure retrievedProcedure = (Procedure) dao.getById(2);

        assertEquals("HT MUSCLE IMAGE SPECT, MULT", retrievedProcedure.getCodeDescription());
    }

    /**
     * Gets all success.
     */
    @Test
    void getAllSuccess() {
        log.info("getAllSuccess runs");
        List<Procedure> Procedures = dao.getAll();
        assertEquals(5, Procedures.size());
    }

    /**
     * Insert procedure success.
     */
    @Test
    void insertProcedureSuccess() {

    }

    /**
     * Update success test.
     */
    @Test
    void updateSuccess() {

    }

    /**
     * Delete
     * Test Delete. Also tests that the delete cascades down to child tables.
     */
    @Test
    void delete() {

    }
}
