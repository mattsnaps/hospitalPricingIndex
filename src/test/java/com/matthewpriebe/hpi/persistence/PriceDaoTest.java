package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.PriceId;
import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.util.Database;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Log4j2
public class PriceDaoTest {

    PriceDao priceDao;
    GenericDao hospitalDao;
    GenericDao procedureDao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        hospitalDao = new GenericDao<>(Hospital.class);
        procedureDao = new GenericDao<>(Procedure.class);

        priceDao = new PriceDao();
    }

    @Test
    void getIdSuccess() {

        PriceId priceId = new PriceId();

        priceId.setHospitalId(1);
        priceId.setProcedureId(32);

        Price price = priceDao.getById(priceId);

        log.info(price.getPrice());
    }
}
