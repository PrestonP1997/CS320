package contact;


public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String address;
	private String phoneNumber;
	
	
public Contact(final String contactID, String fName, String lName, String number, String addressArg) {
		
//***********************Constructor and variable checker*************************
		
	if (contactID == null || contactID.length() > 10) {
		throw new IllegalArgumentException("Invalid ID, null or too long");
	}
	if (fName == null || fName.length() > 10) {
		throw new IllegalArgumentException("Invalid First Name, null or too long");
	}
	// checking last name against requirements
	if (lName == null || lName.length() > 10) {
		throw new IllegalArgumentException("Invalid Last Name, null or too long");
	}
	// checking phone against requirements
	if (number == null || number.length() != 10) {
		throw new IllegalArgumentException("Invalid Phone Number, null or too long");
	}
	// checking address against requirements
	if (addressArg == null || addressArg.length() > 30) {
		throw new IllegalArgumentException("Invalid Address, null or too long");
	}

//Assigns variables if there were no exceptions thrown
	this.contactID = contactID;
	this.firstName = fName;
	this.lastName = lName;
	this.phoneNumber = number;
	this.address = addressArg;
	

}
	
//*******************************VARIABLE SETTERS************************************
	
//First Name
	public void setFirstName(String fName) {
		if (fName == null || fName.length() > 10) {
			throw new IllegalArgumentException("Invalid ID, null or too long");
		}
		this.firstName = fName; 
	}
	 
//Last Name
	public void setLastName(String lName) {
		if (lName == null|| lName.isEmpty() || lName.length() > 10) {
			this.lastName = "NULL";
		}
		else {this.lastName = lName;}
	}

//Phone Number
	public void setPhoneNumber(String number) {
		if (number == null|| number.isEmpty() || number.length() > 10) {
			this.phoneNumber = "NULL";
		}
		else { this.phoneNumber = number;}
	}

//Address
	public void setAddress (String addressArg) {
		if (addressArg == null || addressArg.isEmpty() || address.length() > 30) {
			this.address = "NULL";
		}
		else { this.address = addressArg;}
	}
	 
	
	
//***********************************VARIABLE GETTERS********************************
//Get Contact ID
	public String getContactId() {
		return this.contactID;
	}
	
//Get first name
	public String getFirstName() {
		return this.firstName;
	}
	
//Get last Name
	public String getLastName() {
		return this.lastName;
	}
	
//Get phone number
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
//Get address
	public String getAddress() {
		return this.address;
	}
	
	
	
}
