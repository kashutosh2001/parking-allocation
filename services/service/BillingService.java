package com.yash.parkingallocationsystem.services.service;

import com.yash.parkingallocationsystem.model.Billing;

import java.util.List;

public interface BillingService {
    void addBilling(Billing billing);
    Billing getBillingById(int id);
    List<Billing> getAllBillings();
    void updateBilling(Billing billing);
    void removeBilling(int id);
}
