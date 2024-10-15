package com.yash.parkingallocationsystem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.parkingallocationsystem.dao.dao.FeedbackDao;
import com.yash.parkingallocationsystem.dao.daoimpl.FeedbackDaoImpl;
import com.yash.parkingallocationsystem.model.Feedback;


@WebServlet("/FeedbackControler")
public class FeedbackController extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		Feedback feedback = new Feedback(email, message);
		
		System.out.println("data aa gya h servlet p");
		
		FeedbackDao dao = new FeedbackDaoImpl();
		
		String result = dao.save(feedback);
		
		if(result == "0")
		{
			System.out.println("data a aya h servlet p from database");
		}
		else {
			System.out.println("data nhi aaya servlet p");
		}
	}
}
