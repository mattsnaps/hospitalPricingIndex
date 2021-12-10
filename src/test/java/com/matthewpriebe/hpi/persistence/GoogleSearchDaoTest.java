package com.matthewpriebe.hpi.persistence;

import com.matthewpriebe.hpi.google.OrganicResultsItem;
import com.matthewpriebe.hpi.util.PropertiesLoader;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@Log4j2
public class GoogleSearchDaoTest {

    @Test
    void getSnippetSuccess() {
        GoogleSearchDao dao = new GoogleSearchDao();

        for (OrganicResultsItem item : dao.getSnippet("Men In Black").getOrganicResults()) {
            log.info(item.getSnippet());
        }
    }
}
