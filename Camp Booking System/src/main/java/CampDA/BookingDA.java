package CampDA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import CampJavabean.Campsite;
import java.sql.Date;

public class BookingDA {
	static Connection con = null;
	static PreparedStatement ps = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	
	private static final String dbURL = "jdbc:postgresql://ec2-34-239-241-121.compute-1.amazonaws.com/dfogu31uq8h3mb";
	private static final String user = "kiljgbsypcqcne";
	private static final String pass = "da31ec8fde345a6ed0bc0724f57aa469269b1a98b68fa054da0d20f7b7894763";

	public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(dbURL, user, pass);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
	public void bookingCamp(Campsite mem)throws SQLException {

        // try-with-resource statement will auto close the connection.
        try (Connection con = getConnection();
             PreparedStatement preparedStatement = con.prepareStatement("insert into campsite(no_pax,site_type,checkin_date,checkout_date,remarks)values(?,?,?,?,?) "))
        {
    
            preparedStatement.setInt(1, mem.getNo_pax());
            preparedStatement.setString(2, mem.getSite_type());
            preparedStatement.setDate(3,(Date) mem.getCheckin_date());
            preparedStatement.setDate(4, (Date) mem.getCheckout_date());
            preparedStatement.setString(5, mem.getRemarks());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
