package co.uk.avijit.countries.service;

import co.uk.avijit.countries.models.Countries;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

public class CountriesService {

  private RestClient client;

  public CountriesService(RestClient client) {
    this.client = client;
  }

  public List<Countries> getCountries() {
    Countries countries =
        client.get().uri("").accept(MediaType.APPLICATION_JSON).retrieve().body(Countries.class);

    return List.of(countries);
  }
}
