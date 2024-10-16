package com.yash.parkingallocationsystem.services.service;

import com.yash.parkingallocationsystem.model.Payment;

import java.util.List;

public interface PaymentService {
    void addPayment(Payment payment);
    Payment getPaymentById(int id);
    List<Payment> getAllPayments();
    void updatePayment(Payment payment);
    void removePayment(int id);
}
