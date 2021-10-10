package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.util.Database;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
@Log4j2
public class ProcedureDaoTest {

    ProcedureDao dao;

    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        dao = new ProcedureDao();
    }

    @Test
    void getByIdSuccess() {
        Procedure retrievedProcedure = dao.getById(3);

        log.info("Returns this:" + retrievedProcedure.getProcedureCode());

        assertEquals("HT MUSCLE IMAGE SPECT, MULT", retrievedProcedure.getCodeDescription());
    }

    @Test
    void getAllSuccess() {
        log.info("getAllSuccess runs");
        List<Procedure> Procedures = dao.getAll();
        assertEquals(5, Procedures.size());
    }

    @Test
    void insertHospitalSuccess() {
        Procedure newProcedure = new Procedure("24500", "Under Fracture",
                        " Under Fracture and/or Dislocation Procedures on the Humerus (Upper Arm) and Elbow");

        int id = dao.insert(newProcedure);
        assertNotEquals(0,id);
        Procedure insertedProcedure = dao.getById(id);
        assertEquals(newProcedure, insertedProcedure);
    }
}
