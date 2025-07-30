package co.uk.avijit.countries.controller;


import co.uk.avijit.countries.models.Countries;
import co.uk.avijit.countries.service.CountriesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CountriesController {

    private final CountriesService countriesService;

    public CountriesController(CountriesService countriesService) {
        this.countriesService = countriesService;
    }

    @GetMapping("/countries")
    public List<Countries> countries(@RequestParam("fields")String[] fields) {
        return countriesService.getCountries();
    }

}
