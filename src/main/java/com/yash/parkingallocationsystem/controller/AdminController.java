
package com.yash.parkingallocationsystem.controller;

import com.yash.parkingallocationsystem.dao.AdminDao;
import com.yash.parkingallocationsystem.daoimpl.AdminDaoImpl;
import com.yash.parkingallocationsystem.util.DatabaseUtil;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user")
public class AdminController extends HttpServlet 
{
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {

        response.setContentType("text/html");
        
   
        PrintWriter out = response.getWriter();


        String name = request.getParameter("name");
        String idStr = request.getParameter("id");


        int id = Integer.parseInt(idStr);
//
//        AdminDaoImpl ags = new AdminDaoImpl();
//
//
//        ags.setId(id);
//        ags.setName(name);


       DatabaseUtil jdbc=new DatabaseUtil();
       jdbc.openConnection();
       String query="select * from admin where id="+id;
       
       PreparedStatement statement=jdbc.createPreparedStatement(query);
       try 
       {
    	   ResultSet resultset =statement.executeQuery();
    	   if(resultset.next())
    	   {
    		   String namee=resultset.getString(1);
    		   int idd =resultset.getInt(2);
    		   
    		   System.out.println(namee+"  "+idd);
    	   }
    	   else
    	   {
    		   System.out.println("Not available");
    	   }
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
       }
       finally
       {
    	   System.out.println("finally executed");
       }

//        request.getRequestDispatcher("Profile.jsp").forward(request, response);

        out.print("data will be displayed..!");
        out.print("helloo..");
    }
}

