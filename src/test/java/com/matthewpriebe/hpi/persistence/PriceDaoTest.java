package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.PriceId;
import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * The type Price dao test.
 */
public class PriceDaoTest {


    PriceDao daoPrice;

    HospitalDao daoHospital;

    ProcedureDao daoProcedure;

    /**
     * Sets up.
     * resets the database.
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        daoPrice = new PriceDao();
        daoHospital = new HospitalDao();
        daoProcedure = new ProcedureDao();
    }

    /**
     * Gets all prices from all procedures from all hospitals.
     */
    @Test
    void getAllSuccess() {
        List<Price> Prices = daoPrice.getAll();
        assertEquals(15, Prices.size());
    }

    /**
     * Gets by id success. Verify one procedure from one hospital at one price.
     */
    @Test
    void getByIdSuccess() {
        Hospital hospital = daoHospital.getById(2);
        Procedure procedure = daoProcedure.getById(2);

        PriceId priceId = new PriceId();
        priceId.setHospital(hospital);
        priceId.setProcedure(procedure);

        Price retrievedPrice = daoPrice.getById(priceId);

        assertEquals("4667", retrievedPrice.getPrice());
    }

    /**
     * Insert a new hospital with existing procedure.
     */
    @Test
    void insertSuccess() {
        Hospital newHospital = new Hospital("Final Destination Medical");

        int idHospital = daoHospital.insert(newHospital);

        Hospital hospital = daoHospital.getById(idHospital);
        Procedure procedure = daoProcedure.getById(2);

        PriceId priceId = new PriceId();
        priceId.setProcedure(procedure);
        priceId.setHospital(hospital);

        Price newPrice = new Price("3333", priceId);
        daoPrice.insert(newPrice);

        Price insertedPrice = daoPrice.getById(priceId);

        assertEquals(newPrice, insertedPrice);
    }

    /**
     * Update success price of a procedure from one hospital.
     */
    @Test
    void updateSuccess() {
        String newPrice = "8700";

        Hospital hospital = daoHospital.getById(1);
        Procedure procedure = daoProcedure.getById(4);

        PriceId priceId = new PriceId();
        priceId.setProcedure(procedure);
        priceId.setHospital(hospital);

        Price priceToUpdate = daoPrice.getById(priceId);
        priceToUpdate.setPrice(newPrice);

        daoPrice.saveOrUpdate(priceToUpdate);

        Price priceAfterUpdate = daoPrice.getById(priceId);

        assertEquals(priceToUpdate.getPrice(), newPrice);
    }


    /**
     * Delete procedure from a hospital with price.
     */
    @Test
    void delete() {
        Hospital hospital = daoHospital.getById(3);
        Procedure procedure = daoProcedure.getById(4);

        PriceId priceId = new PriceId();
        priceId.setProcedure(procedure);
        priceId.setHospital(hospital);

        daoPrice.delete(daoPrice.getById(priceId));
        assertNull(daoPrice.getById(priceId));
    }
}
