package CampJavabean;


public class Campsite {
String no_pax;
String site_type;
String checkin_date;
String checkout_date;
String remarks;
String tent_type;
String tent_quantity;



public Campsite(String no_pax, String site_type, String checkin_date,String checkout_date, String remarks) {
	super();
	this.no_pax = no_pax;
	this.site_type = site_type;
	this.checkin_date = checkin_date;
	this.checkout_date = checkout_date;
	this.remarks = remarks;
}
public Campsite() {
	// TODO Auto-generated constructor stub
}
public String getNo_pax() {
	return no_pax;
}
public void setNo_pax(String no_pax) {
	this.no_pax = no_pax;
}
public String getSite_type() {
	return site_type;
}
public void setSite_type(String site_type) {
	this.site_type = site_type;
}
public String getCheckin_date() {
	return checkin_date;
}
public void setCheckin_date(String checkin_date) {
	this.checkin_date = checkin_date;
}
public String getCheckout_date() {
	return checkout_date;
}
public void setCheckout_date(String checkout_date) {
	this.checkout_date = checkout_date;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
public String getTent_type() {
	return tent_type;
}
public void setTent_type(String tent_type) {
	this.tent_type = tent_type;
}
public String getTent_quantity() {
	return tent_quantity;
}
public void setTent_quantity(String tent_quantity) {
	this.tent_quantity = tent_quantity;
}



}
