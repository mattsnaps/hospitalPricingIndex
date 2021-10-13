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

public class PriceDaoTest {

    PriceDao daoPrice;
    HospitalDao daoHospital;
    ProcedureDao daoProcedure;

    @BeforeEach
    void setUp() {

        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        daoPrice = new PriceDao();
        daoHospital = new HospitalDao();
        daoProcedure = new ProcedureDao();
    }

    @Test

    void GetByIdSuccess() {
        Hospital hospital = daoHospital.getById(2);
        Procedure procedure = daoProcedure.getById(2);

        PriceId priceId = new PriceId();
        priceId.setHospital(hospital);
        priceId.setProcedure(procedure);

        Price retrievedPrice = daoPrice.getById(priceId);

        assertEquals("4667", retrievedPrice.getPrice());
    }

    @Test
    void getAllSuccess() {
        List<Price> Prices = daoPrice.getAll();
        assertEquals(15, Prices.size());
    }

    @Test
    void insertNewHospitalNewProcedure() {
        Hospital newHospital = new Hospital("Final Destination Medical");
        Procedure newProcedure = new Procedure("28470", "Fracture, Foot and Toes", "Under Fracture and/or Dislocation Procedures on the Foot and Toes");

        daoHospital.insert(newHospital);
        daoProcedure.insert(newProcedure);

        newHospital = daoHospital.getById();

        PriceId priceId = new PriceId();
        priceId.setHospital(newHospital);
        priceId.setProcedure(newProcedure);

        Price addedPrice = new Price("3222");

        daoPrice.insert(addedPrice);

        Price insertedPrice = daoPrice.getById(priceId);
        assertEquals(addedPrice, insertedPrice);

    }
}
