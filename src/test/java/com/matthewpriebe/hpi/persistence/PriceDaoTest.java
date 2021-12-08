package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.*;
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

    GenericDao daoProcedureType;

    /**
     * Sets up.
     * resets the database.
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        daoPrice = new GenericDao<>(ProcedureHospital.class);
        daoHospital = new GenericDao<>(Hospital.class);
        daoProcedure = new GenericDao<>(Procedure.class);
        daoProcedureType = new GenericDao<>(ProcedureType.class);
    }

    /**
     * Gets all prices from all procedures from all hospitals.
     */
    @Test
    void getAllSuccess() {
        List<ProcedureHospital> allPrices = daoPrice.getAll();

        for (ProcedureHospital priceItem : allPrices) {
        }

        assertEquals(518, allPrices.size());
    }

    /**
     * Gets by id success. Verify one procedure from one hospital at one price.
     */
    @Test
    void getByIdSuccess() {
        List<ProcedureHospital> allPrices = daoPrice.getAll();

        ProcedureHospital procedureHospital = (ProcedureHospital) daoPrice.getById(1);

        ProcedureHospital foundPrice = new ProcedureHospital();

        for (ProcedureHospital priceItem : allPrices) {
            if(priceItem.getId() == 14) {
                foundPrice = priceItem;
            }
        }

        log.info(foundPrice.getPrice());
    }

    /**
     * Insert a new hospital with existing procedure.
     */
    @Test
    void insertSuccess() {

        ProcedureType procedureType = (ProcedureType) daoProcedureType.getById(32);

        Procedure newProcedure = new Procedure("911", "HCBH", "TestCode For test new Procedure", procedureType);
        procedureType.addProcedure(newProcedure);

        Hospital newHospital = new Hospital("Sacred Hearts", "SSM-Bordhead");
        int insertedProductId = daoHospital.insert(newHospital);

        Hospital insertedHospital = (Hospital) daoHospital.getById(insertedProductId);

        int id = daoProcedure.insert(newProcedure);

        Procedure insertedProcedure = (Procedure) daoProcedure.getById(id);

        insertedProcedure.addHospital(insertedHospital);

        daoProcedure.saveOrUpdate(insertedProcedure);

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
