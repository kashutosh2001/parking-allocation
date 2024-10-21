package com.yash.parkingallocationsystem.serviceimpl;

import com.yash.parkingallocationsystem.dao.VehicleDao;
import com.yash.parkingallocationsystem.daoimpl.VehicleDaoImpl;
import com.yash.parkingallocationsystem.domain.Vehicle;
import com.yash.parkingallocationsystem.service.VehicleService;

import java.util.List;

public class VehicleServiceImpl implements VehicleService {


    @Override
    public void addVehicle(Vehicle vehicle) {
        VehicleDao vehicleDao = new VehicleDaoImpl();
        vehicleDao.save(vehicle);

    }

    @Override
    public void updateVehicle(Vehicle vehicle) {

    }

    @Override
    public void deleteVehicle(int vehicleId) {

    }

    @Override
    public Vehicle getVehicleById(int vehicleId) {
        VehicleDao vehicleDao = new VehicleDaoImpl();
        return vehicleDao.getById(vehicleId);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        VehicleDao vehicleDao = new VehicleDaoImpl();
        return vehicleDao.getAll();
    }
}
