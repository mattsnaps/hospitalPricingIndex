package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.google.GoogleResponse;
import com.matthewpriebe.hpi.google.OrganicResultsItem;
import com.matthewpriebe.hpi.util.PropertiesLoader;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
public class GoogleSearchDaoTest {

    @Test
    void getSnippetSuccess() {
        GoogleSearchDao dao = new GoogleSearchDao();

        GoogleResponse response = dao.getSnippet("Men In Black");

        for (OrganicResultsItem item : response.getOrganicResults()) {
            log.info(item.getSnippet());
        }

        assertEquals(3, response.getOrganicResults().size());
    }
}
