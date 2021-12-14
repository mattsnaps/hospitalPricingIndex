package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.entity.ProcedureType;
import com.matthewpriebe.hpi.entity.User;
import com.matthewpriebe.hpi.google.GoogleResponse;
import com.matthewpriebe.hpi.google.OrganicResultsItem;
import com.matthewpriebe.hpi.util.Database;
import com.matthewpriebe.hpi.util.PropertiesLoader;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

@Log4j2
public class UserDaoTest {

    GenericDao userDao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");

        userDao = new GenericDao<>(ProcedureType.class);
    }

    @Test
    void getByPropertySuccess() {

        //List<User> retreivedUser = userDao.findByPropertyEqual("email", userName);
    }
}
