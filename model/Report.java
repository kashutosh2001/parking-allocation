package com.yash.parkingallocationsystem.model;

import java.util.Date;

public class Report {
    private int id;                     // Unique identifier for the report
    private Date reportDate;            // Date of the report generation
    private String reportType;          // Type of the report (e.g., "Monthly", "Daily")
    private String generatedBy;         // Name of the admin who generated the report

    // Constructor
    public Report() {}

    public Report(int id, Date reportDate, String reportType, String generatedBy) {
        this.id = id;
        this.reportDate = reportDate;
        this.reportType = reportType;
        this.generatedBy = generatedBy;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", reportDate=" + reportDate +
                ", reportType='" + reportType + '\'' +
                ", generatedBy='" + generatedBy + '\'' +
                '}';
    }
}
