package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.*;
import com.matthewpriebe.hpi.util.Database;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log4j2
public class PriceDaoTest {

    PriceDao priceDao;
    GenericDao genericPriceDao;
    GenericDao hospitalDao;
    GenericDao procedureDao;
    GenericDao procedureTypeDao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        hospitalDao = new GenericDao<>(Hospital.class);
        procedureDao = new GenericDao<>(Procedure.class);
        genericPriceDao = new GenericDao<>(Price.class);
        procedureTypeDao = new GenericDao<>(ProcedureType.class);
        priceDao = new PriceDao();
    }

    @Test
    void getIdSuccess() {

        PriceId priceId = new PriceId();

        priceId.setHospitalId(1);
        priceId.setProcedureId(32);

        Price price = priceDao.getById(priceId);

        log.info(price.getHospital().getHospitalName() + " - " + price.getProcedure().getCodeDescription() + " - " + price.getPrice());
    }

    @Test
    void getByPropertySuccess() {

        List<Price> prices = genericPriceDao.findByPropertyEqual("hospital", 1);

        for (Price item : prices) {
            log.info(item.getProcedure().getCodeDescription());
        }
    }
    @Test
    void getAllSuccess() {
    }
}
