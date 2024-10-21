package com.yash.parkingallocationsystem.service;

import java.util.List;

import com.yash.parkingallocationsystem.domain.Report;

public interface ReportServiceInt {


public interface ReportService {
    List<Report> generateMonthlyReport();
    List<Report> generateVehicleTypeReport();
}
}
