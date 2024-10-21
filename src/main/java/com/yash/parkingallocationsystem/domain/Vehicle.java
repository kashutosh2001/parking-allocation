package com.yash.parkingallocationsystem.domain;

public class Vehicle {

    private int vehicleId;
    private String vehicleNumber;
    private int userId;
    private String vehicleType;

    public Vehicle(int vehicleId, String vehicleNumber, int userId, String vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.userId = userId;
        this.vehicleType = vehicleType;
    }

    public Vehicle() {

    }

    public Vehicle(int vehicleId, String vehicleType, String vehicleNumber) {
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleNumber=" + vehicleNumber +
                ", userId=" + userId +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
