package com.champsoft.vrms2432714.modules.cars.infrastructure.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicles")
public class VehicleJpaEntity {
    @Id
    public String id;
    @Column(nullable = false, unique = true)
    public String vin;
    @Column(nullable = false)
    public String make;
    @Column(nullable = false)
    public String model;
    @Column(nullable = false)
    public int vehicle_year;
    @Column(nullable = false)
    public String status;
}
