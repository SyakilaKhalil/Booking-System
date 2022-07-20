package CampHandler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class deleteParticipant
 */
@WebServlet("/deleteParticipant")
public class deleteParticipant extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PreparedStatement ps = null;
    HttpSession session = null; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteParticipant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:postgresql://ec2-34-239-241-121.compute-1.amazonaws.com/dfogu31uq8h3mb";
    	String user = "kiljgbsypcqcne";
    	String pass = "da31ec8fde345a6ed0bc0724f57aa469269b1a98b68fa054da0d20f7b7894763";
	     String phonenum= request.getParameter("phonenum");
	     
	     try {
	            Class.forName("org.postgresql.Driver");
	            Connection connection = DriverManager.getConnection(dbURL,user,pass);
	            ps = connection.prepareStatement("DELETE FROM participant where phonenum=?");
	            ps.setString(1, phonenum);

	            ps.executeUpdate();
	            response.sendRedirect("ViewStaffAcc.jsp");

	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
