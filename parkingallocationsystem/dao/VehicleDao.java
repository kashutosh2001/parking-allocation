package com.yash.parkingallocationsystem.dao;

import com.yash.parkingallocationsystem.domain.Vehicle;

import java.util.List;

public interface VehicleDao {

    void save (Vehicle vehicle);
    void update(Vehicle vehicle);
    void delete(int vehicleId);
    Vehicle getById(int vehicleId);
    List<Vehicle> getAll();
}
