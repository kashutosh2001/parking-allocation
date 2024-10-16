package com.yash.parkingallocationsystem.dao.daoimpl;


import com.yash.parkingallocationsystem.dao.dao.BillingDAO;
import com.yash.parkingallocationsystem.model.Billing;

import java.util.List;

public class BillingDAOImpl implements BillingDAO {

    @Override
    public void createBilling(Billing billing) {

    }

    @Override
    public Billing getBillingById(int id) {
        return null;
    }

    @Override
    public List<Billing> getAllBillings() {
        List<Billing> billings = new java.util.ArrayList<>();
        return billings;
    }

    @Override
    public void updateBilling(Billing billing) {

    }

    @Override
    public void deleteBilling(int id) {

    }
}
