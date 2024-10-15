////package com.yash.parkingallocationsystem.util;
////
////public class DatabaseUtil {
////}
//
//
//
//package com.yash.parkingallocationsystem.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.ResultSet;
//
//public class DatabaseUtil {
//
//    private static final String DBurl = "jdbc:mysql://localhost:3306/parking_allocation_db";
//    private static final String DbDriver = "com.mysql.cj.jdbc.Driver";
//    private static final String DbUser = "root";
//    private static final String DbPass = "root";
//
//    public void loadDriver() {
//        try {
//            Class.forName(DbDriver);
//            System.out.println("Driver load ho chuka h");
//        } catch (ClassNotFoundException e) {
//        	
//        	System.out.println("Driver load nhi hua h");
//            e.printStackTrace();
//        }
//    }
//
//    public Connection getConnection() {
//        Connection con = null;
//        try {
//            con = DriverManager.getConnection(DBurl, DbUser, DbPass);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return con;
//    }
//
//    // Combined method to close all resources
//    public void closeResources(Connection con) {
//        try 
//        {
////            if (rs != null) {
////                rs.close();
////            }
////            if (stmt != null) {
////                stmt.close();
////            }
//            if (con != null) {
//                con.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}






package com.yash.parkingallocationsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatabaseUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/parking_allocation_db";
    String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";

    public void loadDriver() {
        try {
            Class.forName(DB_DRIVER);
            System.out.println("Driver loaded successfully");
        } catch (ClassNotFoundException e) {
            System.err.println("Failed to load driver: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            if (con != null) {
                System.out.println("Database connected successfully");
            }
        } catch (SQLException e) {
            System.err.println("Failed to connect to database: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }

    public void closeResources(Connection con, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.err.println("Error closing resources: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Overloaded method to close only Connection
    public void closeResources(Connection con) {
        closeResources(con, null, null);
    }
}