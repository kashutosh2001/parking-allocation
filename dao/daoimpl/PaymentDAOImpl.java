package com.yash.parkingallocationsystem.dao.daoimpl;


import com.yash.parkingallocationsystem.dao.dao.PaymentDAO;
import com.yash.parkingallocationsystem.model.Payment;

import java.util.List;

public class PaymentDAOImpl implements PaymentDAO {

    @Override
    public void createPayment(Payment payment) {

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
    public void deletePayment(int id) {

    }
}
