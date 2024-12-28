package com.douglas.carbon_footprint.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "carbon-footprint-client", url =  "https://carbonfootprint1.p.rapidapi.com")
public interface CarbonFootprintClient {


    @GetMapping("/CarbonFootprintFromCarTravel")
    String getFromCarTravel(
            @RequestParam int distance,
            @RequestParam String vehicle,
            @RequestHeader("x-rapidapi-key") String apiKey,
            @RequestHeader("x-rapidapi-host") String apiHost
    );

    @GetMapping("/CarbonFootprintFromFlight")
    String getFromFlight(
            @RequestParam int distance,
            @RequestParam String type,
            @RequestHeader("x-rapidapi-key") String apiKey,
            @RequestHeader("x-rapidapi-host") String apiHost
    );

    @GetMapping("/CarbonFootprintFromMotorBike")
    String getFromMotorBike(
            @RequestParam String type,
            @RequestParam int distance,
            @RequestHeader("x-rapidapi-key") String apiKey,
            @RequestHeader("x-rapidapi-host") String apiHost
    );
}
