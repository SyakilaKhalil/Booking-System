package CampHandler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import CampDA.ParticipantDA;
import CampJavabean.Participant;
/**
 * Servlet implementation class ParticipantHandler
 */
@WebServlet("/participant")
public class ParticipantHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ParticipantDA rd;  
    public void init(){
		rd = new ParticipantDA();
	}
    public ParticipantHandler() {
        super();
        rd = new ParticipantDA();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "createParticipant": 
				createParticipant(request,response);
			break;
			}	
	}
		catch (SQLException e) {
			throw new ServletException(e);
			}
	}
	private void createParticipant(HttpServletRequest request, HttpServletResponse response) 
		throws SQLException, IOException{
		String participant_name = request.getParameter("participant_name");
		String participant_email= request.getParameter("participant_email");
		String participant_password = request.getParameter("participant_password");
		String participant_phonenum= request.getParameter("participant_phonenum");
		

		Participant mem = new Participant();

		mem.setParticipant_name(participant_name);
		mem.setParticipant_email(participant_email);
		mem.setParticipant_password(participant_password);
		mem.setParticipant_phonenum(participant_phonenum);
	

        rd.createParticipant(mem);
        response.sendRedirect("index.jsp");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
