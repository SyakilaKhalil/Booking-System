package CampJavabean;

public class Participant {

	public String participant_name;
	public String participant_email;
	public String participant_password;
	public String participant_phonenum;
	
	public Participant( String participant_name, String participant_email,
			String participant_password, String participant_phonenum) {
		super();
		
		this.participant_name = participant_name;
		this.participant_email = participant_email;
		this.participant_password = participant_password;
		this.participant_phonenum = participant_phonenum;
	}

	
	
	public Participant(String participant_name, String participant_email, String participant_password) {
		super();
		this.participant_name = participant_name;
		this.participant_email = participant_email;
		this.participant_password = participant_password;
		
	}



	public Participant() {
		// TODO Auto-generated constructor stub
	}



	public String getParticipant_name() {
		return participant_name;
	}

	public void setParticipant_name(String participant_name) {
		this.participant_name = participant_name;
	}

	public String getParticipant_email() {
		return participant_email;
	}

	public void setParticipant_email(String participant_email) {
		this.participant_email = participant_email;
	}

	public String getParticipant_password() {
		return participant_password;
	}

	public void setParticipant_password(String participant_password) {
		this.participant_password = participant_password;
	}
	
	public String getParticipant_phonenum() {
		return participant_phonenum;
	}

	public void setParticipant_phonenum(String participant_phonenum) {
		this.participant_phonenum = participant_phonenum;
	}
}
