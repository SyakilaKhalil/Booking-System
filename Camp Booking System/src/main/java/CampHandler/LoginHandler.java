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
 * Servlet implementation class LoginHandler
 */
@WebServlet("/login")
public class LoginHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginHandler() {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String participant_email=request.getParameter("participant_name");
    	String participant_password=request.getParameter("participant_password");

		//Create session
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
			PreparedStatement pst = connection.prepareStatement("select * from participant where participant_email=? and participant_password = ? ");
			
			// Set string - set for ? by order
			pst.setString(1, participant_email);
			pst.setString(2, participant_password);
			
			// Execute Query Method
			ResultSet result = pst.executeQuery();
			if(result.next()) {
				
				session.setAttribute("participant_name", result.getString("participant_name"));
				session.setAttribute("participant_email", result.getString("participant_email"));
				session.setAttribute("participant_password", result.getString("participant_password"));
				session.setAttribute("participant_phonenum", result.getString("participant_phonenum"));
				dispatcher = request.getRequestDispatcher("Homepage.jsp");
			}
		else {
			request.setAttribute("status", "failed");
			dispatcher = request.getRequestDispatcher("index.jsp");
		}
		
		dispatcher.forward(request, response);
		
		{
			
		}
	} catch(Exception e) {
		e.printStackTrace();
	}
    	
  	}
}
    
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "participantLogin": 
				participantLogin(request,response);
			break;
			}	
	}
		catch (SQLException e) {
			throw new ServletException(e);
			}
		
	}
	private void participantLogin(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException{
		String participant_email=request.getParameter("participant_email");
		String participant_password=request.getParameter("participant_password");
		
		Participant mem = new Participant();
		
		mem.setParticipant_email(participant_email);
		mem.setParticipant_password(participant_password);
		rd.participantLogin(mem);
        response.sendRedirect("Homepage.jsp");
		
	}*/
	



