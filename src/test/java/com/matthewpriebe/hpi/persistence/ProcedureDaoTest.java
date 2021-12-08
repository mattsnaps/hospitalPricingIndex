package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.entity.ProcedureType;
import com.matthewpriebe.hpi.util.Database;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * The type Procedure dao test.
 */
@Log4j2
public class ProcedureDaoTest {

    GenericDao procedureTypeDao;
    GenericDao procedureDao;
    GenericDao hospitalDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        hospitalDao = new GenericDao<>(Hospital.class);
        procedureDao = new GenericDao<>(Procedure.class);
        procedureTypeDao = new GenericDao<>(ProcedureType.class);
    }

    /**
     * Gets by id success.
     */
    @Test
    void getByIdSuccess() {
        Procedure retrievedProcedure = (Procedure) procedureDao.getById(54);

        assertEquals("329", retrievedProcedure.getCode());
        assertEquals("MS-DRG", retrievedProcedure.getCodeType());
        assertEquals("Major small & large bowel procedures w MCC", retrievedProcedure.getCodeDescription());
    }

    /**
     * Gets all success.
     */
    @Test
    void getAllSuccess() {
        List<Procedure> allProcedures = procedureDao.getAll();

        assertEquals(519, allProcedures.size());
    }

    /**
     * Insert procedure success.
     */
    @Test
    void insertProcedureSuccess() {
        ProcedureType retrievedProcedureType = (ProcedureType) procedureTypeDao.getById(13);
        Procedure newProcedure = new Procedure("911","1018FDDS","Shave Beard Head", retrievedProcedureType);

        List<Procedure> allProcedureBefore = procedureDao.getAll();

        procedureDao.insert(newProcedure);

        List<Procedure> allProcedureAfter = procedureDao.getAll();

        assertEquals(allProcedureBefore.size() + 1, allProcedureAfter.size());
    }

    /**
     * Update success test.
     */
    @Test
    void updateSuccess() {
        String codeDescrtiption = "Insert ant segment drain into";

        Procedure procedureToUpdate = (Procedure) procedureDao.getById(1);
        procedureToUpdate.setCodeDescription(codeDescrtiption);

        procedureDao.saveOrUpdate(procedureToUpdate);

        Procedure procedureAfterUpdate = (Procedure) procedureDao.getById(1);
        assertEquals(codeDescrtiption, procedureAfterUpdate.getCodeDescription());
    }

    /**
     * Delete
     * Test Delete. Also tests that the delete cascades down to child tables.
     */
    @Test
    void delete() {
        Procedure procedureToDelete = (Procedure) procedureDao.getById(14);

        procedureDao.delete(procedureToDelete);

        Procedure deletedProcedure = (Procedure) procedureDao.getById(14);

        assertNull(deletedProcedure);
    }

    @Test
    void getByPropertySuccess() {
        List<Procedure> procedures = procedureDao.findByPropertyEqual("codeType", "Hospital Charge Master");

        for (Procedure item : procedures) {
            log.info(item.getCodeDescription() + " -- " + item.getProcedureType().getRevDescription());
        }
    }
}
