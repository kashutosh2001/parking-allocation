package com.yash.parkingallocationsystem.dao.dao;


import com.yash.parkingallocationsystem.model.Payment;

import java.util.List;

public interface PaymentDAO {
    void createPayment(Payment payment);
    Payment getPaymentById(int id);
    List<Payment> getAllPayments();
    void updatePayment(Payment payment);
    void deletePayment(int id);
}
