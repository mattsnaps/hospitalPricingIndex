package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.util.Database;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
public class HospitalDaoTest {

    /**
     * The Dao.
     */
    HospitalDao dao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new HospitalDao();
    }

    /**
     * Verify successful retrieval of a Book
     */
    @Test
    void getByIdSuccess() {
        Hospital retrievedHospital = dao.getById(1);
        assertEquals("Monroe Clinic", retrievedHospital.getHospitalName());
    }

    /**
     * Verify successful retrieval of all Books
     */
    @Test
    void getAllSuccess() {
        log.info("getAllSuccess runs");

        List<Hospital> Hospitals = dao.getAll();
        assertEquals(4, Hospitals.size());
    }

    @Test
    void insertHospitalSuccess() {
        Hospital newHospital = new Hospital("Greater Mary's Medical");

        int id = dao.insert(newHospital);
        assertNotEquals(0,id);
        Hospital insertedHospital = dao.getById(id);
        assertEquals(newHospital, insertedHospital);
    }
    @Test
    void updateSuccess() {

        String newHospitalName = "Sacred Hearts";

        Hospital hospitalToUpdate = dao.getById(2);
        hospitalToUpdate.setHospitalName(newHospitalName);

        dao.saveOrUpdate(hospitalToUpdate);
        Hospital hospitalAfterUpdate = dao.getById(2);

        assertEquals(hospitalToUpdate, hospitalAfterUpdate);
    }
    @Test
    void deleteSuccess() {
        dao.delete(dao.getById(4));
        assertNull(dao.getById(4));
    }
}
