package com.matthewpriebe.hpi.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matthewpriebe.hpi.google.GoogleResponse;
import com.matthewpriebe.hpi.util.PropertiesLoader;
import lombok.extern.log4j.Log4j2;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import java.util.Properties;

/**
 * This manges the google search Dao
 */
@Log4j2
public class GoogleSearchDao implements PropertiesLoader {
    Properties properties;
    String BASE_URL;
    String SEARCH_CONFIG;
    String API_KEY;


    /**
     * This method recieves a search terms converts it so it can be used for the api.
     * The api url is contructed and sent. Info is returned in the form of JSON and returned to
     * an method that called this one.
     * @param searchTerm
     * @return
     */
    public GoogleResponse getSnippet(String searchTerm) {

        try {
            properties = loadProperties("/serpapi.properties");
        } catch (Exception e) {
            log.error(e);
        }

        BASE_URL = properties.getProperty("url");
        SEARCH_CONFIG = properties.getProperty("search.config");
        API_KEY = properties.getProperty("api.key");

        log.info(searchTerm + "\n");

        char plus = '+';
        searchTerm = searchTerm.replace('&', plus);
        searchTerm = searchTerm.replace(' ', plus);
        searchTerm = searchTerm.replace('^', plus);
        searchTerm = searchTerm.replace('<', plus);
        searchTerm = searchTerm.replace('<', plus);

        log.info(BASE_URL);
        log.info(searchTerm);
        log.info(SEARCH_CONFIG);
        log.info(API_KEY);

        Client client = ClientBuilder.newClient();

        WebTarget target = client.target(BASE_URL + searchTerm + SEARCH_CONFIG + API_KEY);

        String response = target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
        GoogleResponse snippet = null;
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);;

        try {
            snippet = mapper.readValue(response, GoogleResponse.class);
        } catch (JsonProcessingException error) {
            log.error(error);
        }

        return snippet;
    }
}
