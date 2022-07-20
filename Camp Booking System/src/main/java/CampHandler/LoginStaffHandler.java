package CampHandler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginStaffHandler
 */
@WebServlet("/LoginStaffHandler")
public class LoginStaffHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginStaffHandler() {
        super();
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
		String staff_email=request.getParameter("staff_email");
    	String staff_password=request.getParameter("staff_password");
    	
    	HttpSession session = request.getSession();
		
		//request dispatcher
		RequestDispatcher dispatcher = null;
    	String dbURL = "jdbc:postgresql://ec2-34-239-241-121.compute-1.amazonaws.com/dfogu31uq8h3mb";
    	String user = "kiljgbsypcqcne";
    	String pass = "da31ec8fde345a6ed0bc0724f57aa469269b1a98b68fa054da0d20f7b7894763";
    	
    	try {
			Class.forName("org.postgresql.Driver");
			Connection connection = DriverManager.getConnection(dbURL,user,pass);
			
			//SQL Statement/Query 
			PreparedStatement pst = connection.prepareStatement("select * from staff where staff_email=? and staff_password = ? ");
			
			// Set string - set for ? by order
			pst.setString(1, staff_email);
			pst.setString(2, staff_password);
			
			// Execute Query Method
			ResultSet result = pst.executeQuery();
			if(result.next()) {
				
				session.setAttribute("staff_name", result.getString("staff_name"));
				session.setAttribute("staff_email", result.getString("staff_email"));
				session.setAttribute("staff_password", result.getString("staff_password"));
				session.setAttribute("staff_phonenum", result.getString("staff_phonenum"));
				dispatcher = request.getRequestDispatcher("HomepageStaff.jsp");
			}
		else {
			request.setAttribute("status", "failed");
			dispatcher = request.getRequestDispatcher("LoginStaff.jsp");
		}
		
		dispatcher.forward(request, response);
		
		{
			
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
    	
	}
}
