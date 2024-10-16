package com.yash.parkingslot.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.parkingslot.dbutils.JDBCUtil;

/**
 * Servlet implementation class UserRegistration
 */
//@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	JDBCUtil jdbcUtil;
	private Connection con= null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegistration() {
    	
    	jdbcUtil = new JDBCUtil();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	   String query="insert into user values(default,?,?,?,?,?)";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		String userPassword = request.getParameter("pass");
		String userConfirmPassword = request.getParameter("confirmPass");
		String userRole = request.getParameter("userRole");
		
		 con=jdbcUtil.openConnection();
		 
		 try {
			pstmt =con.prepareStatement(query);
			
			pstmt.setString(1, userName);
			pstmt.setString(2, userEmail);
			pstmt.setString(3, userPassword);
			pstmt.setString(4, userConfirmPassword);
			pstmt.setString(5, userRole);
			
			int rows = pstmt.executeUpdate();
			
			if(rows>0)
			{
				out.println("User Data Inserted Successfully");
				RequestDispatcher rd = request.getRequestDispatcher("user_login.jsp");
				rd.include(request, response);
			}
			else
			{
				out.println("User Data Not Inserted Successfully");
				RequestDispatcher rd = request.getRequestDispatcher("user_registration.jsp");
				rd.include(request, response);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}

}
