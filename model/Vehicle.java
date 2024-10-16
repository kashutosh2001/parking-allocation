package com.yash.parkingallocationsystem.model;

public class Vehicle {
    private int id;                     // Unique identifier for the vehicle
    private int userId;                 // ID of the user who owns the vehicle
    private String vehicleType;          // Type of the vehicle (e.g., "Car", "Bike")
    private String licensePlate;        // License plate number of the vehicle

    // Constructor
    public Vehicle() {}

    public Vehicle(int id, int userId, String vehicleType, String licensePlate) {
        this.id = id;
        this.userId = userId;
        this.vehicleType = vehicleType;
        this.licensePlate = licensePlate;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", userId=" + userId +
                ", vehicleType='" + vehicleType + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
