package com.yash.parkingallocationsystem.model;

public class Payment {
    private int id;                     // Unique identifier for the payment
    private int billingId;              // ID of the associated billing record
    private String transactionId;        // Unique transaction identifier for the payment
    private String paymentStatus;        // Status of the payment (e.g., "Success", "Failure")

    // Constructor
    public Payment() {}

    public Payment(int id, int billingId, String transactionId, String paymentStatus) {
        this.id = id;
        this.billingId = billingId;
        this.transactionId = transactionId;
        this.paymentStatus = paymentStatus;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBillingId() {
        return billingId;
    }

    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", billingId=" + billingId +
                ", transactionId='" + transactionId + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
