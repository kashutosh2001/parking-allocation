package com.yash.parkingallocationsystem.controller;

import com.yash.parkingallocationsystem.domain.Vehicle;
import com.yash.parkingallocationsystem.service.VehicleService;
import com.yash.parkingallocationsystem.serviceimpl.VehicleServiceImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/addVehicle")

public class VehicleController extends HttpServlet {

    private VehicleService vehicleService;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String vehicleId = req.getParameter("vehicleId");
        vehicleService = new VehicleServiceImpl();
        try {
            if (vehicleId!=null){
                // Fetch vehicle details by vehicleId
                Vehicle vehicle = vehicleService.getVehicleById(Integer.parseInt(vehicleId));
                req.setAttribute("vehicle",vehicle);
                RequestDispatcher dispatcher = req.getRequestDispatcher("vehicleDetail.jsp");
                dispatcher.forward(req,resp);
            }
            else {
                // Fetch all vehicles
                List<Vehicle> vehicles = vehicleService.getAllVehicles();
                req.setAttribute("vehicleList",vehicles);
                RequestDispatcher dispatcher = req.getRequestDispatcher("vehicleList.jsp");
                dispatcher.forward(req,resp);
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        vehicleService = new VehicleServiceImpl();
        try {
            if (action.equals("add")){
                addVehicle(req,resp);

            } else if (action.equals("update")) {
                updateVehicle(req,resp);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public void addVehicle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String vehicleType = req.getParameter("vehicleType");
        String vehicleNumber = req.getParameter("vehicleNumber");
        int userId = Integer.parseInt(req.getParameter("userId"));

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNumber(vehicleNumber);
        vehicle.setVehicleType(vehicleType);
        vehicle.setUserId(userId);

        vehicleService.addVehicle(vehicle);
        resp.sendRedirect("vehicleConfirmation.jsp");
    }

    public void updateVehicle(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String vehicleType = req.getParameter("vehicleType");
        String vehicleNumber = req.getParameter("vehicleNumber");
        int userId = Integer.parseInt(req.getParameter("userId"));
        int vehicleId = Integer.parseInt(req.getParameter("vehicleId"));

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleId(vehicleId);
        vehicle.setVehicleType(vehicleType);
        vehicle.setVehicleNumber(vehicleNumber);

        vehicleService.updateVehicle(vehicle);
        //resp.sendRedirect("");
    }

}
