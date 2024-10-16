import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Welcome
 */
//@WebServlet("/Welcome")
public class Welcome extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException
	{
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		
		if(username ==null)
		{
			response.sendRedirect("Login.jsp");
		}
		else
		{
			request.setAttribute("username", username);
			request.getRequestDispatcher("Welcome.jsp").forward(request,response);
		}
	}
}
