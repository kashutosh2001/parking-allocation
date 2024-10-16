package com.yash.parkingallocationsystem.model;

import java.util.Date;

public class Booking {
    private int id;                     // Unique identifier for the booking
    private int userId;                 // ID of the user who made the booking
    private int parkingSlotId;          // ID of the booked parking slot
    private Date startTime;              // Start time of the booking
    private Date endTime;                // End time of the booking
    private String status;               // Status of the booking (e.g., "Confirmed", "Cancelled")

    // Constructor
    public Booking() {}

    public Booking(int id, int userId, int parkingSlotId, Date startTime, Date endTime, String status) {
        this.id = id;
        this.userId = userId;
        this.parkingSlotId = parkingSlotId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
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

    public int getParkingSlotId() {
        return parkingSlotId;
    }

    public void setParkingSlotId(int parkingSlotId) {
        this.parkingSlotId = parkingSlotId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", userId=" + userId +
                ", parkingSlotId=" + parkingSlotId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                '}';
    }
}
