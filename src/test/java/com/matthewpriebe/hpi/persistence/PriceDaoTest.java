package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.PriceId;
import com.matthewpriebe.hpi.entity.Procedure;
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


    PriceDao daoPrice;

    GenericDao daoHospital;

    GenericDao daoProcedure;

    /**
     * Sets up.
     * resets the database.
     */
    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        daoPrice = new PriceDao();
        daoHospital = new GenericDao<>(Hospital.class);
        daoProcedure = new GenericDao<>(Procedure.class);
    }

    /**
     * Gets all prices from all procedures from all hospitals.
     */
    @Test
    void getAllSuccess() {
        List<Price> Prices = daoPrice.getAll();

        log.info("Starting Test");

        for (Price price : Prices) {
            //log.info(price.getHospital().getHospitalName() + " " + price.getProcedure().getProcedureCode() + " " + price.getPrice());
        }

        assertEquals(15, Prices.size());
    }

    /**
     * Gets by id success. Verify one procedure from one hospital at one price.
     */
    @Test
    void getByIdSuccess() {
        Hospital hospital = (Hospital) daoHospital.getById(1);
        Procedure procedure = (Procedure) daoProcedure.getById(2);

        PriceId priceId = new PriceId();

        priceId.setHospital(hospital);
        priceId.setProcedure(procedure);

        Price retrievedPrice = daoPrice.getById(priceId);

        assertEquals("$11,939.91", retrievedPrice.getPrice());
    }

    /**
     * Insert a new hospital with existing procedure.
     */
    @Test
    void insertSuccess() {

    }

    /**
     * Update success price of a procedure from one hospital.
     */
    @Test
    void updateSuccess() {
        String newPrice = "8700";

        Hospital hospital = (Hospital) daoHospital.getById(1);
        Procedure procedure = (Procedure) daoProcedure.getById(4);

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
        Hospital hospital = (Hospital) daoHospital.getById(1);
        Procedure procedure = (Procedure) daoProcedure.getById(4);

        PriceId priceId = new PriceId();
        priceId.setProcedure(procedure);
        priceId.setHospital(hospital);

        daoPrice.delete(daoPrice.getById(priceId));
        assertNull(daoPrice.getById(priceId));
    }
}
