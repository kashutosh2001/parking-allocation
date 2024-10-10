//package com.yash.parkingallocationsystem.util;
//
//public class DatabaseUtil {
//}



package com.yash.parkingallocationsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatabaseUtil {

    private static final String DBurl = "jdbc:mysql://localhost:3306/parking_allocation_db";
    private static final String DbDriver = "com.mysql.cj.jdbc.Driver";
    private static final String DbUser = "root";
    private static final String DbPass = "root";

    public void loadDriver() {
        try {
            Class.forName(DbDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(DBurl, DbUser, DbPass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    // Combined method to close all resources
    public void closeResources(Connection con) {
        try 
        {
//            if (rs != null) {
//                rs.close();
//            }
//            if (stmt != null) {
//                stmt.close();
//            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}