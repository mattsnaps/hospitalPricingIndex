package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.ProcedureType;
import com.matthewpriebe.hpi.util.Database;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@Log4j2
public class ProcedureTypeDaoTest {

    GenericDao dao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new GenericDao<>(ProcedureType.class);
    }

    @Test
    void getByIdSuccess() {
        ProcedureType retrievedProcedure = (ProcedureType) dao.getById(13);

        assertEquals("Radiology - Diagnostic - Arteriography", retrievedProcedure.getRevDescription());
    }

    @Test
    void getAllSuccess() {
        List<ProcedureType> allProcedureTypes = dao.getAll();

        assertEquals(58, allProcedureTypes.size());
    }

    @Test
    void deleteSucces() {
        ProcedureType procedureToDelete = (ProcedureType) dao.getById(1);

        dao.delete(procedureToDelete);

        ProcedureType deletedProcedure = (ProcedureType) dao.getById(1);

        assertNull(deletedProcedure);
    }

    @Test
    void insertSuccess() {
        ProcedureType newProcedureType = new ProcedureType("911","Call to the police");

        List<ProcedureType> allTypesBefore = dao.getAll();

        dao.insert(newProcedureType);

        List<ProcedureType> allTypesAfter = dao.getAll();

        assertEquals(allTypesBefore.size() +1, allTypesAfter.size());

    }

    @Test
    void updateSuccess() {
        String revDescription = "Non-Categorized Procedures";

        ProcedureType procedureToUpdate = (ProcedureType) dao.getById(1);
        procedureToUpdate.setRevDescription(revDescription);

        dao.saveOrUpdate(procedureToUpdate);

        ProcedureType procedureAfterUpdate = (ProcedureType) dao.getById(1);
        assertEquals(revDescription, procedureAfterUpdate.getRevDescription());
    }

    @Test
    void getByPropertyEqualSuccess() {
        List<ProcedureType> procedureTypes = dao.findByPropertyEqual("revCode", "0404");

        assertEquals(1, procedureTypes.size());
    }
}
