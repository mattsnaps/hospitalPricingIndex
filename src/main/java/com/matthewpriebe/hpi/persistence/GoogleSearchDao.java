package com.matthewpriebe.hpi.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matthewpriebe.hpi.google.GoogleResponse;
import lombok.extern.log4j.Log4j2;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

@Log4j2
public class GoogleSearchDao {

    public GoogleResponse getSnippet() {
        Client client = ClientBuilder.newClient();

        WebTarget target =
                client.target("https://serpapi.com/search.json?engine=google&q=Total+hip+arthroplasty+&google_domain=google.com&gl=us&num=1&api_key=062af4e39fedd6356c4e64ead9cdfb30f966af4e8fd2790645d914af1ba607a4");

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
