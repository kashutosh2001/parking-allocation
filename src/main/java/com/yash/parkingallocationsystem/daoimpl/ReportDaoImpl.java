package com.yash.parkingallocationsystem.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yash.parkingallocationsystem.dao.ReportDao;
import com.yash.parkingallocationsystem.domain.Report;
import com.yash.parkingallocationsystem.util.DatabaseUtil;

public class ReportDaoImpl implements ReportDao {
    @Override
    public List<Report> fetchMonthlyReportData() {
        List<Report> reports = new ArrayList<>();
        String query = "SELECT COUNT(*) AS total_vehicles, MONTH(billing_date) AS month FROM billing GROUP BY MONTH(billing_date)";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Report report = new Report();
                report.setReportName("Monthly Vehicle Report");
                report.setReportData("Month: " + resultSet.getInt("month") + ", Total Vehicles: " + resultSet.getInt("total_vehicles"));
                reports.add(report);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reports;
    }

    @Override
    public List<Report> fetchVehicleTypeReportData() {
        List<Report> reports = new ArrayList<>();
        String query = "SELECT vehicle_type, COUNT(*) AS total FROM vehicles GROUP BY vehicle_type";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Report report = new Report();
                report.setReportName("Vehicle Type Report");
                report.setReportData("Vehicle Type: " + resultSet.getString("vehicle_type") + ", Total: " + resultSet.getInt("total"));
                reports.add(report);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return reports;
    }
}

