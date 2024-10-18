package com.yash.parkingallocationsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.parkingallocationsystem.util.DatabaseUtil;



@WebServlet("/registeration")
public class UserController  extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		DatabaseUtil jdbc=new DatabaseUtil();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("Name");
		String email=request.getParameter("Email");
		String no=request.getParameter("No");
		String password=request.getParameter("password");
		String cpassword=request.getParameter("cpassword");
		int mob=Integer.parseInt(no);
		if(password.equals(cpassword)) 
		{
			String query = "insert into users values(null,?,?,?,?,?)";

			try {
			    PreparedStatement statement = jdbc.createPreparedStatement(query);
			    statement.setString(1, name);
			    statement.setString(2, email);
			    statement.setInt(3, mob);
			    statement.setString(4, password);
			    statement.setString(5, cpassword);

			    int rowsAdded = statement.executeUpdate();
			    
			    
				if(rowsAdded!=0)
				{
					RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
					rd.forward(request, response);
				}
				else
				{
					System.out.println("not added");
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		
	}
}
