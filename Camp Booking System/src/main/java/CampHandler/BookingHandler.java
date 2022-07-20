package CampHandler;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import CampDA.BookingDA;
import CampJavabean.Campsite;

/**
 * Servlet implementation class BookingHandler
 */
@WebServlet("/booking")
public class BookingHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookingDA rd;  
    public void init(){
		rd = new BookingDA();
	}  
    public BookingHandler() {
        super();
        rd = new BookingDA();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "bookingCamp": 
				bookingCamp(request,response);
			break;
			}	
	}
		catch (SQLException e) {
			throw new ServletException(e);
			}
		
	}
	private void bookingCamp(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException{
			int no_pax= Integer.parseInt(request.getParameter("no_pax"));
			String site_type=request.getParameter("site_type");
			Date checkin_date=Date.valueOf("checkin_date");
			Date checkout_date=Date.valueOf("checkout_date");
			String remarks=request.getParameter("remarks");
		Campsite mem = new Campsite();
		mem.setNo_pax(no_pax);
		mem.setSite_type(site_type);
		mem.setCheckin_date(checkin_date);
		mem.setCheckout_date(checkout_date);
		mem.setRemarks(remarks);
		rd.bookingCamp(mem);
        response.sendRedirect("BookingSucces.jsp");	
		
	}
	

}
