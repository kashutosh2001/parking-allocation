import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/space","root","root");
		
		PreparedStatement ps = con.prepareStatement("Select * from admin where email = ? and password = ?");
		
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", rs.getString("name"));
			response.sendRedirect("Welcome.jsp");	
		}
		
		else {
			request.setAttribute("errorMessage", "email is not correct");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
			
		}
		
		ps.close();
		con.close();
	}
	
		catch (Exception e)
			{
				e.printStackTrace();
			}
	}
}

