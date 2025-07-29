package co.uk.avijit.countries.service;

import co.uk.avijit.countries.models.Countries;
import org.apache.hc.client5.http.classic.HttpClient;

import java.util.Collections;
import java.util.List;

public class CountriesService {

    private HttpClient httpClient;

    public CountriesService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public List<Countries> getCountries() {
        return Collections.emptyList();
    }
}
