package com.yash.parkingallocationsystem.model;

public class ParkingSlot {
    private int id;                     // Unique identifier for the parking slot
    private String location;             // Location of the parking slot
    private boolean isAvailable;         // Availability status of the parking slot
    private String vehicleType;          // Type of vehicle that can park (e.g., "Bike", "Car")

    // Constructor
    public ParkingSlot() {}

    public ParkingSlot(int id, String location, boolean isAvailable, String vehicleType) {
        this.id = id;
        this.location = location;
        this.isAvailable = isAvailable;
        this.vehicleType = vehicleType;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "id=" + id +
                ", location='" + location + '\'' +
                ", isAvailable=" + isAvailable +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
