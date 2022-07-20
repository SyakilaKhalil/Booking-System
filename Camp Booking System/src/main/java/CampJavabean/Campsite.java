package CampJavabean;
import java.util.Date;

public class Campsite {
String no_pax;
String site_type;
Date checkin_date;
Date checkout_date;
String remarks;


public Campsite(String no_pax, String site_type, Date checkin_date, Date checkout_date, String remarks) {
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
public Date getCheckin_date() {
	return checkin_date;
}
public void setCheckin_date(Date checkin_date) {
	this.checkin_date = checkin_date;
}
public Date getCheckout_date() {
	return checkout_date;
}
public void setCheckout_date(Date checkout_date) {
	this.checkout_date = checkout_date;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}




}
