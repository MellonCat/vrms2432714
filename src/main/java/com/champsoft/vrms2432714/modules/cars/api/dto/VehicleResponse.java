package com.champsoft.vrms2432714.modules.cars.api.dto;

public record VehicleResponse(
        String id,
        String vin,
        String make,
        String model,
        int year,
        String status) {}