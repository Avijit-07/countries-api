package co.uk.avijit.countries.config;

import co.uk.avijit.countries.service.CountriesService;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class Config {

    @Bean
    public RestClient providesClient(){
        return RestClient.builder().baseUrl("").build();
    }

    @Bean
    public CountriesService providesService(RestClient client) {
        return new CountriesService(client);
    }
}
