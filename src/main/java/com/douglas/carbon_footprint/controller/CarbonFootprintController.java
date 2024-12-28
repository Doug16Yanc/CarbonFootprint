package com.douglas.carbon_footprint.controller;

import com.douglas.carbon_footprint.service.CarbonFootprintService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarbonFootprintController {

   private final CarbonFootprintService carbonFootprintService;

    public CarbonFootprintController(CarbonFootprintService carbonFootprintService) {
        this.carbonFootprintService = carbonFootprintService;
    }


    @GetMapping("/car-travel")
    public String getCarbonFootprintCarTravel() {
        return carbonFootprintService.getFromCarTravel();
    }

    @GetMapping("/flight-travel")
    public String getCarbonFootprintFlightTravel() {
        return carbonFootprintService.getFromFlight();
    }

    @GetMapping("/motorbike-travel")
    public String getCarbonFootprintMotorBikeTravel() {
        return carbonFootprintService.getFromMotorbike();
    }

}
