package com.matthewpriebe.hpi.persistence;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The type Hospital dao test.
 */
@Log4j2
public class HospitalDaoTest {


    GenericDao daoProcedure;
    GenericDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

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
