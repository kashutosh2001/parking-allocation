package com.yash.parkingallocationsystem.service;

import com.yash.parkingallocationsystem.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    void addVehicle(Vehicle vehicle);
    void updateVehicle(Vehicle vehicle);
    void deleteVehicle(int vehicleId);
    Vehicle getVehicleById(int vehicleId);
    List<Vehicle> getAllVehicles();

}
