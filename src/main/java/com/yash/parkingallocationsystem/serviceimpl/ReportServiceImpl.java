package com.yash.parkingallocationsystem.serviceimpl;

import java.util.List;

import com.yash.parkingallocationsystem.dao.ReportDao;
import com.yash.parkingallocationsystem.daoimpl.ReportDaoImpl;
import com.yash.parkingallocationsystem.domain.Report;
import com.yash.parkingallocationsystem.service.ReportServiceInt.ReportService;

public class ReportServiceImpl implements ReportService {
    private ReportDao reportdao;

    public ReportServiceImpl() {
        this.reportdao = new ReportDaoImpl();
    }

    @Override
    public List<Report> generateMonthlyReport() {
        return reportdao.fetchMonthlyReportData();
    }

    @Override
    public List<Report> generateVehicleTypeReport() {
        return reportdao.fetchVehicleTypeReportData();
    }
}




