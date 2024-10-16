import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Registration extends HttpServlet {
	  private static final long serialVersionUID = 1L;

	  private Connection con = null;
	  private PreparedStatement ps = null;

	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException
	 {

	    response.setContentType("text/html");

	    String name = request.getParameter("name");
	    String email = request.getParameter("email");
	    String password = request.getParameter("password");

	    String confirmpassword = request.getParameter("confirmPassword");


	    System.out.println("in register");
	    PrintWriter out = response.getWriter();
	    out.println(name);

	    // Validation checks (same as before)
	    if (name.length() < 6 || name.length() > 20) {
	      request.setAttribute("errorMessage", "name should be between 6-20 chars");
	      request.getRequestDispatcher("Register.jsp").forward(request, response);
	      return;
	    }

	    if (!email.endsWith("@yash.com")) {
	      request.setAttribute("errorMessage", "email should have @yash.com");
	      request.getRequestDispatcher("Register.jsp").forward(request, response);
	      return;
	    }

	    if (!password.equals(confirmpassword)) {
	      request.setAttribute("errorMessage", "passwords don't match");
	      request.getRequestDispatcher("Register.jsp").forward(request, response);
	      return;

	    }

	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/space","root", "root");

	    

	      ps = con.prepareStatement("insert into admin values(?, ?, ?)");
	      ps.setString(1, name);
	      ps.setString(2, email);
	      ps.setString(3, password);
	      ps.executeUpdate();

	      RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
	      rd.forward(request, response);
	      // Choose between forward or redirect
	    } catch (SQLException e) {
	      // Log the exception details for debugging
	      e.printStackTrace();
	      // Provide a user-friendly error message
	      request.setAttribute("errorMessage", "Error registering user: " + e.getMessage());
	      request.getRequestDispatcher("Register.jsp").forward(request, response);
	    } catch (Exception e) {
	      // Handle other unexpected exceptions
	      e.printStackTrace();
	      // Provide a generic error message
	      request.setAttribute("errorMessage", "An error occurred during registration.");
	      request.getRequestDispatcher("Register.jsp").forward(request, response);
	    } finally {
	      try {
	        if (con != null) {
	          con.close();
	        }
	        if (ps != null) {
	          ps.close();
	        }
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	  }
}