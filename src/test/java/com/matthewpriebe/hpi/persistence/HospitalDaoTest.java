package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.util.Database;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * The type Hospital dao test.
 */
@Log4j2
public class HospitalDaoTest {

    GenericDao procedureDao;
    GenericDao hospitalDao;

    /**
     * Run set up tasks before each test:
     * 1. execute sql which deletes everything from the table and inserts records
     * 2. Create any objects needed in the tests
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        hospitalDao = new GenericDao<>(Hospital.class);
        procedureDao = new GenericDao<>(Procedure.class);
    }

    /**
     * Verify successful retrieval of a Hospital
     */
    @Test
    void getByIdSuccess() {
        Hospital retrievedHospital = (Hospital) hospitalDao.getById(1);

        assertEquals("Monroe Clinic", retrievedHospital.getHospitalName());

        log.info(retrievedHospital.getHospitalName());
    }

    /**
     * Verify successful retrieval of all Hospitals
     */
    @Test
    void getAllSuccess() {
        List<Hospital> allHospitals = hospitalDao.getAll();

        assertEquals(1, allHospitals.size());
    }

    /**
     * Insert hospital success test.
     */
    @Test
    void insertHospitalSuccess() {
        Hospital newHospital = new Hospital("Last Stop Medical","SSM-SW");

        List<Hospital> allHospitalsBefore = hospitalDao.getAll();

        hospitalDao.insert(newHospital);

        List<Hospital> allHospitalsAfter = hospitalDao.getAll();

        assertEquals(allHospitalsBefore.size() + 1, allHospitalsAfter.size());
    }


    /**
     * Update Hospital success.
     */
    @Test
    void updateSuccess() {
        String hospitalName = "Monroe Clinic Hospital";

        Hospital hospitalToUpdate = (Hospital) hospitalDao.getById(1);
        hospitalToUpdate.setHospitalName(hospitalName);

        hospitalDao.saveOrUpdate(hospitalToUpdate);

        Hospital hospitalAfterUpdate = (Hospital) hospitalDao.getById(1);
        assertEquals(hospitalName, hospitalAfterUpdate.getHospitalName());
    }

    /**
     * Delete Hospital success. Cascade delete works down to child tables.
     */
    @Test
    void deleteSuccess() {
        Hospital hospitalToDelete = (Hospital) hospitalDao.getById(1);

        hospitalDao.delete(hospitalToDelete);

        Hospital deletedHospital = (Hospital) hospitalDao.getById(1);

        assertNull(deletedHospital);
    }

    @Test
    void getByPropertySuccess() {
        List<Hospital> hospitals = hospitalDao.findByPropertyEqual("hospitalName", "Monroe Clinic");

        for (Hospital item : hospitals) {
            log.info(item.getHospitalName() + item.getEntity());
        }
    }
}
