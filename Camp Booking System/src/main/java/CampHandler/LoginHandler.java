package CampHandler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import CampDA.ParticipantDA;


/**
 * Servlet implementation class LoginHandler
 */
@WebServlet("/login")
public class LoginHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ParticipantDA rd;  
    public void init(){
		rd = new ParticipantDA();
	}  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginHandler() {
        super();
        rd = new ParticipantDA();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String participant_email=request.getParameter("participant_email");
		String participant_password=request.getParameter("participant_password");
		RequestDispatcher view=null;
		try {
			request.setAttribute("i", ParticipantDA.getInfoByEmail(participant_email,participant_password));
			 view = request.getRequestDispatcher("Homepage.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 view = request.getRequestDispatcher("index.jsp");
			e.printStackTrace();
		}
		//RequestDispatcher view = request.getRequestDispatcher("viewIndex.jsp");
		view.forward(request, response); 
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
	


}
