package maven_jawad;

public class User {
private String firstName;
private String lastName;
private int phoneNumber;
private String emailAddress;
private String password;
private String birthdate;
private String gender;


public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getBirthdate() {
	return birthdate;
}

public void setBirthdate(String birthdate) {
	this.birthdate = birthdate;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}



public User(String firstName, String lastName, int phoneNumber, String emailAddress, String password, String birthdate, String gender) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.phoneNumber = phoneNumber;
	this.emailAddress = emailAddress;
	this.password = password;
	this.birthdate = birthdate;
	this.gender = gender;
	
	
}
}
