package com.yash.parkingallocationsystem.model;

import java.util.Date;

public class Billing {
    private int id;                     // Unique identifier for the billing record
    private int userId;                 // ID of the user associated with the billing
    private int parkingSlotId;          // ID of the parking slot associated with the billing
    private double amount;               // Amount charged for the billing
    private String status;               // Billing status (e.g., "Paid", "Pending", "Failed")
    private Date billingDate;            // Date when the billing was generated
    private String paymentMethod;        // Payment method used (e.g., "Credit Card", "Razorpay")

    // Constructor
    public Billing() {}

    public Billing(int id, int userId, int parkingSlotId, double amount, String status, Date billingDate, String paymentMethod) {
        this.id = id;
        this.userId = userId;
        this.parkingSlotId = parkingSlotId;
        this.amount = amount;
        this.status = status;
        this.billingDate = billingDate;
        this.paymentMethod = paymentMethod;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "id=" + id +
                ", userId=" + userId +
                ", parkingSlotId=" + parkingSlotId +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", billingDate=" + billingDate +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
