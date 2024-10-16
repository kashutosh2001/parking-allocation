package com.yash.parkingallocationsystem.dao.dao;


import com.yash.parkingallocationsystem.model.Billing;

import java.util.List;

public interface BillingDAO {
    void createBilling(Billing billing);
    Billing getBillingById(int id);
    List<Billing> getAllBillings();
    void updateBilling(Billing billing);
    void deleteBilling(int id);
}
