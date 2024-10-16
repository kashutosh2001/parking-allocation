package com.yash.parkingallocationsystem.services.serviceimpl;


import com.yash.parkingallocationsystem.model.Payment;
import com.yash.parkingallocationsystem.services.service.PaymentService;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public void addPayment(Payment payment) {

    }

    @Override
    public Payment getPaymentById(int id) {
        return null;
    }

    @Override
    public List<Payment> getAllPayments() {
        List<Payment> payments = new java.util.ArrayList<>();
        return payments;
    }

    @Override
    public void updatePayment(Payment payment) {

    }

    @Override
    public void removePayment(int id) {

    }
}
