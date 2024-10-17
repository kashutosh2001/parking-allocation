package com.yash.parkingallocationsystem.daoimpl;

import com.yash.parkingallocationsystem.dao.VehicleDao;
import com.yash.parkingallocationsystem.domain.Vehicle;
import com.yash.parkingallocationsystem.util.DatabaseUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VehicleDaoImpl implements VehicleDao {
    private Connection connection;
    private DatabaseUtil databaseUtil;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public VehicleDaoImpl(){
        databaseUtil = new DatabaseUtil();
    }

    @Override
    public void save(Vehicle vehicle) {

        boolean isSuccess = false;
        String query = "Insert into vehicle(vehicleType, vehicleNumber, userId) values(?,?,?)";
        PreparedStatement preparedStatement = databaseUtil.createPreparedStatement(query);

        try {
            preparedStatement.setString(1, vehicle.getVehicleType());
            preparedStatement.setString(2, vehicle.getVehicleNumber());
            preparedStatement.setInt(3,vehicle.getUserId());
            int rowAffected = preparedStatement.executeUpdate();
            if (rowAffected>0){
                isSuccess = true;
            }
            if(isSuccess){
                System.out.println("Vehicle suceesfully added");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Vehicle vehicle) {


    }

    @Override
    public void delete(int vehicleId) {

    }

    @Override
    public Vehicle getById(int vehicleId) {
        return null;
    }

    @Override
    public List<Vehicle> getAll() {
        List<Vehicle> vehicleList = new ArrayList<>();
        String query = "select * from vehicle";

        databaseUtil = new DatabaseUtil();
        try {
            PreparedStatement preparedStatement = databaseUtil.createPreparedStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // Retrieve values from the result set
                int vehicleId = resultSet.getInt("vehicleId");
                String vehicleType = resultSet.getString("vehicleType");
                String vehicleNumber = resultSet.getString("vehicleNumber");

                // Create Vehicle object and add to list
                Vehicle vehicle = new Vehicle(vehicleId,vehicleType,vehicleNumber);
                vehicleList.add(vehicle);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();  // Handle any SQL errors
        } finally {
            // Close the ResultSet, PreparedStatement, and connection in finally block.
            databaseUtil.closeResultSet(resultSet);
            databaseUtil.closePreparedStatement(preparedStatement);
            databaseUtil.closeConnection();
        }
        return vehicleList;
    }
}
