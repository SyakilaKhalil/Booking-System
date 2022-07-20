package CampHandler;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import CampDA.ParticipantDA;
import CampJavabean.Participant;

/**
 * Servlet implementation class UpdateAccHandler
 */
@WebServlet("/UpdateAccHandler")
public class UpdateAccHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ParticipantDA rd;
	public void init(){
		rd = new ParticipantDA();
	}
    public UpdateAccHandler() {
        super();
        rd = new ParticipantDA();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "updateAcc":
				updateAcc(request,response);
				break;
				
			}
		}
		catch (SQLException e) {
			throw new ServletException(e);
			}
	}
	private void updateAcc(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		{
			HttpSession session = request.getSession();
			String participant_name=request.getParameter("participant_name");
			String participant_email=request.getParameter("participant_email");
			String participant_password=request.getParameter("participant_password");
			String participant_phonenum=request.getParameter("participant_phonenum");
			Participant par= new Participant();
			
			par.setParticipant_name(participant_name);
			par.setParticipant_email(participant_email);
			par.setParticipant_password(participant_password);
			par.setParticipant_phonenum(participant_phonenum);
			
			rd.updateAcc(par);
			
			session.removeAttribute("participant_name");
			session.removeAttribute("participant_email");
			session.removeAttribute("participant_password");
			session.removeAttribute("participant_phonenum");
			
			response.sendRedirect("Homepage.jsp");
	}
	}
}
