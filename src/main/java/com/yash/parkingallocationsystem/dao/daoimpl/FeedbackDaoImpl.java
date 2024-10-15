package com.yash.parkingallocationsystem.dao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;

import com.yash.parkingallocationsystem.dao.dao.FeedbackDao;
import com.yash.parkingallocationsystem.model.Feedback;
import com.yash.parkingallocationsystem.util.DatabaseUtil;


public class FeedbackDaoImpl implements  FeedbackDao{

	public String save(Feedback feedback) {
		// TODO Auto-generated method stub
		
		DatabaseUtil cn = new DatabaseUtil();
		cn.loadDriver();
		Connection con = cn.getConnection();
		
		System.out.println("In dao impl class ");
		
		String result = null;
		String query = "insert into feedbacks values(?, ?)";
		
		PreparedStatement ps= null;
		
		try {
			ps = con.prepareStatement(query);
			
			ps.setString(1, feedback.getEmail());
			ps.setString(2, feedback.getDescription());
			ps.execute();
			
			System.out.println("data save ho gya h");
			
			result = "0";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception aa  gai h bhaisahab");
		}
		finally {
		    // Close all resources with a single method call
			cn.closeResources(con);
		}
		
		return result;
	}

}
