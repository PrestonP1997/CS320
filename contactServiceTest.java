package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import contact.contactService;



@TestMethodOrder(OrderAnnotation.class)
class contactServiceTest {

//*******************TESTS CREATION AND ADDITION OF CONTACT TO ARRAYLIST****************
	@Test
	//@Order(1)
	void testContactServiceAddContact() {
		contactService service = new contactService();
		service.addContact("firstname","lastname","5555555555","address");
		assertTrue(service.contactList.get(0).getContactId().equals("1"));
		assertTrue(service.contactList.get(0).getFirstName().equals("firstname"));
		assertTrue(service.contactList.get(0).getLastName().equals("lastname"));
		assertTrue(service.contactList.get(0).getPhoneNumber().equals("5555555555"));
		assertTrue(service.contactList.get(0).getAddress().equals("address"));

	}

//****************TESTS THE SEARCH/GET METHOD AS WELL AS THE DELETE METHOD********************
	@Test
	void testContactServiceDelete() {
	//create new service and verify the list is empty
		contactService service = new contactService();
		assertTrue(service.contactList.size() == 0);
		
	//add a contact and verify the size of the list has increased, and is not empty
		service.addContact("firstname","lastname","5555555555","address");
		assertTrue(service.contactList.size() == 1);
		assertTrue(!service.contactList.isEmpty());
		
	//deletes the contact then verifies that the list is empty again
		service.deleteContact("1");
		assertTrue(service.getContact("1") == false);
		assertTrue(service.contactList.isEmpty());
	}

	
//********************UPDATE FIRST NAME TEST**********************************
	@Test
	void testContactServiceUpdateFirstName() {
		contactService service = new contactService();
		service.addContact("firstname","lastname","5555555555","address");
		service.updateFirstName("FirstName", "1");
		assertTrue(service.contactList.get(0).getFirstName().equals("FirstName"));
	}
	
	
//*********************UPDATE LAST NAME TEST*********************************
	@Test
	void testContactServiceUpdateLastName() {
		contactService service = new contactService();
		assertTrue(service.contactList.isEmpty());
		service.addContact("firstname","lastname","5555555555","address");
		service.updateLastName("LastName", "1");
		assertTrue(service.contactList.get(0).getLastName().equals("LastName"));
	}
	
//*********************UPDATE ADDRESS TEST************************************
	@Test
	void testContactServiceUpdateAddress() {
		contactService service = new contactService();
		assertTrue(service.contactList.isEmpty());
		service.addContact("firstname","lastname","5555555555","address");
		service.updateAddress("New address", "1");
		assertTrue(service.contactList.get(0).getAddress().equals("New address"));
	}
	
//**********************UPDATE PHONE NUMBER TEST********************************
	@Test
	void testContactServiceUpdatePhoneNumber() {
		contactService service = new contactService();
		assertTrue(service.contactList.isEmpty());
		service.addContact("firstname", "lastname", "5555555555", "address");
		service.updateNumber("9999999999", "1");
		assertTrue(service.contactList.get(0).getPhoneNumber().equals("9999999999"));
	}
	
}








