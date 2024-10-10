package com.yash.parkingallocationsystem.controller;

import com.yash.parkingallocationsystem.dao.dao.AdminDao;
import com.yash.parkingallocationsystem.dao.daoimpl.AdminDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class AdminController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        
   
        PrintWriter out = response.getWriter();


        String name = request.getParameter("name");
        String idStr = request.getParameter("id");


        int id = Integer.parseInt(idStr);

        AdminDaoImpl ags = new AdminDaoImpl();


        ags.setId(id);
        ags.setName(name);


        request.setAttribute("ags", ags);

     
        request.getRequestDispatcher("Profile.jsp").forward(request, response);

        out.print("data will be displayed..!");
        out.print("helloo..");
    }
}