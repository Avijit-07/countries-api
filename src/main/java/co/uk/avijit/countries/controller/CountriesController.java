package co.uk.avijit.countries.controller;

import co.uk.avijit.countries.models.Countries;
import co.uk.avijit.countries.service.CountriesService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {

  private final CountriesService countriesService;

  public CountriesController(CountriesService countriesService) {
    this.countriesService = countriesService;
  }

  @GetMapping("/countries")
  public List<Countries> countries(@RequestParam("fields") String[] fields) {
    return countriesService.getCountries();
  }
}
