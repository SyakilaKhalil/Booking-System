package CampDA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import CampJavabean.Participant;

public class ParticipantDA {
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
	//for create account participant
	public void createParticipant(Participant mem) throws SQLException {

        // try-with-resource statement will auto close the connection.
        try (Connection con = getConnection();
             PreparedStatement preparedStatement = con.prepareStatement("insert into participant(participant_name,participant_email,participant_password,participant_phonenum)values(?,?,?,?) "))
        {
    
            preparedStatement.setString(1, mem.getParticipant_name());
            preparedStatement.setString(2, mem.getParticipant_email());
            preparedStatement.setString(3, mem.getParticipant_password());
            preparedStatement.setString(4, mem.getParticipant_phonenum());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	//for login account participant
	public void participantLogin(Participant mem) throws SQLException {
		try (Connection con = getConnection();
	             PreparedStatement preparedStatement = con.prepareStatement("Select * from participant where participant_email=? and participant_password=?"))
	        {
	    
	            preparedStatement.setString(1, mem.getParticipant_email());
	            preparedStatement.setString(2, mem.getParticipant_password());

	            preparedStatement.executeQuery();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	/*public static Participant getInfoByEmail(String participant_email, String participant_password) throws SQLException {
		Participant  i=new Participant ();
		try (Connection con = getConnection();
	             PreparedStatement preparedStatement = con.prepareStatement("Select * from participant where participant_email=? and participant_password=?")){
			preparedStatement.setString(1,participant_email);
			preparedStatement.setString(1,participant_password);
			rs = ps.executeQuery();
			if(rs.next()) {
				i.setParticipant_email(rs.getString("participant_email"));
				i.setParticipant_name(rs.getString("participant_password"));		
			}
			
			con.close();
			
		}catch (Exception e) {
	          e.printStackTrace();
	    }
		
		return i;
			
		}*/
	public boolean updateAcc(Participant par)throws SQLException {
		boolean rowUpdated;
		try (Connection connection= getConnection();
				PreparedStatement statement =connection.prepareStatement("update participant set participant_name=?,participant_password=?, participant_phonenum=? where participant_email=?");){
					statement.setString(1, par.getParticipant_name());
		            statement.setString(2, par.getParticipant_email());
		            statement.setString(3, par.getParticipant_password());
		            statement.setString(4, par.getParticipant_phonenum());
		         
		            
		            rowUpdated=statement.executeUpdate()>0;
				}
				return rowUpdated;
		
	}
	
	
}
