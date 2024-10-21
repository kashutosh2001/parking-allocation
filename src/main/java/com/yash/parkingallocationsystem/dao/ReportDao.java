package com.yash.parkingallocationsystem.dao;

import java.util.List;

import com.yash.parkingallocationsystem.domain.Report;

public interface ReportDao {
    List<Report> fetchMonthlyReportData();
    List<Report> fetchVehicleTypeReportData();
}
