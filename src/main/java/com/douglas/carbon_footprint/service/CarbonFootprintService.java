package com.douglas.carbon_footprint.service;

import com.douglas.carbon_footprint.client.CarbonFootprintClient;
import org.springframework.stereotype.Service;

@Service
public class CarbonFootprintService {

    private final CarbonFootprintClient carbonFootprintClient;

    public CarbonFootprintService(CarbonFootprintClient carbonFootprintClient) {
        this.carbonFootprintClient = carbonFootprintClient;
    }

    public String getFromCarTravel() {
        return carbonFootprintClient.getFromCarTravel(
                2000,
                "SmallDieselCar",
                "",
                ""
        );
    }

    public String getFromFlight() {
        return carbonFootprintClient.getFromFlight(
                2000,
                "DomesticFlight",
                "",
                ""
        );
    }

    public String getFromMotorbike() {
        return carbonFootprintClient.getFromMotorBike(
                "SmallMotorBike",
                2000,
                "",
                ""
        );
    }
}
