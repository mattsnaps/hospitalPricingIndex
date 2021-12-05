package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.ProcedureType;
import com.matthewpriebe.hpi.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}
