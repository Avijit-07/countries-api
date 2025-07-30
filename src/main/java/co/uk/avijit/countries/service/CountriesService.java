package co.uk.avijit.countries.service;

import co.uk.avijit.countries.config.Config;
import co.uk.avijit.countries.models.Countries;
import org.apache.hc.client5.http.classic.HttpClient;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

import java.util.Collections;
import java.util.List;

public class CountriesService {

    private RestClient client;

    public CountriesService(RestClient client) {
        this.client = client;
    }

    public List<Countries> getCountries() {
        Countries countries = client.get().uri("").accept(MediaType.APPLICATION_JSON).retrieve().body(Countries.class);

        return List.of(countries);

    }
}
