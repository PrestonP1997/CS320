package contact;

import java.util.ArrayList;

public class contactService {

	public String newFirstName;
	public String newLastName;
	public String newAddress;
	public String newNum;
	public static String contactID;

	
	public  ArrayList<Contact> contactList = new ArrayList<Contact>(0);
	
	
//***********************Create New Unique ID***********************************************
	public  String createID() {
		String newId;
		//String contactID;
		
		if(contactList.size() == 0) {
			contactID = "0";
		}
		else {
			int arraySize = contactList.size();
			contactID = contactList.get(arraySize - 1).getContactId();
		}
		
	//Converts the string ID into an integer, adds one to the integer, then converts back to string
			int tempInt = Integer.valueOf(contactID);
			tempInt += 1;
			newId = Integer.toString(tempInt);
			return newId;
		
		
	}
	
//**********This method adds contacts to the ArrayList of contacts: contactList*********
	public void addContact(String firstName, String lastName, String number, String address) {
		String newID = createID();
		Contact newContact = new Contact(newID, firstName, lastName, number, address);
		contactList.add(newContact);
	};
	
	
	
//********************************GET CONTACT METHOD***********************************
	public boolean getContact(String contactID) {
		boolean found = false;
		for(int pos = 0; pos < contactList.size(); pos++) {
			if(contactList.get(pos).getContactId().equals(contactID)) {
				found = true;
			}
		}
		return found;
	};
	
//********************************DELETE CONTACT METHOD***********************************
	public void deleteContact(String contactID) {
		for(int pos = 0; pos < contactList.size(); pos++) {
			if (contactList.get(pos).getContactId().equals(contactID)) {
				contactList.remove(pos);
			}
		}
	};
	
	
//***************************Update contact first name **********************************
	public void updateFirstName(String newFirstName, String contactID) {
		for(int pos = 0; pos < contactList.size(); pos++) {
			if(contactList.get(pos).getContactId().equals(contactID)) {
				contactList.get(pos).setFirstName(newFirstName);
				break;
			}
		}
	}
	
	
//***************************Update contact last name **********************************
	public void updateLastName(String newLastName, String contactID) {
		for(int pos = 0; pos < contactList.size(); pos++) {
			if(contactList.get(pos).getContactId().equals(contactID)) {
				contactList.get(pos).setLastName(newLastName);
				break;
			}
		}
	}
	
//***************************Update contact phone number **********************************
	public void updateNumber(String newNum, String contactID) {
		for(int pos = 0; pos < contactList.size(); pos++) {
			if(contactList.get(pos).getContactId().equals(contactID)) {
				contactList.get(pos).setPhoneNumber(newNum);
				break;
			}

		}
	}
	
	
//***************************Update contact address **********************************
	public void updateAddress(String newAddress, String contactID) {
		for(int pos = 0; pos < contactList.size(); pos++) {
			if(contactList.get(pos).getContactId().equals(contactID)) {
				contactList.get(pos).setAddress(newAddress);
				break;
			}

		}
	}
}



