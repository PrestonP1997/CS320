package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contact.Contact;

class ContactTest {

//**************************CREATION OF OBJECT TEST**************************
	@Test
	void testContactCalss() {
		Contact newContact = new Contact("0000000001", "John", "Doe", "5555555555", 
				"This is an address");
		assertTrue(newContact.getContactId() == "0000000001");
		assertTrue(newContact.getFirstName() == "John");
		assertTrue(newContact.getLastName() == "Doe");
		assertTrue(newContact.getPhoneNumber() == "5555555555");
		assertTrue(newContact.getAddress() == "This is an address");
	}
	
//**************************FIRST NAME TESTS***********************************
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("0000000001", "This name should cause an error", "Raquel",
				"5555555555", "This is an address");
		});
	}
	
	@Test
	void testFirstNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("0000000001", null, "Raquel",
				"5555555555", "This is an address");
		});
	}
	
	//Tests both the set and get methods in one test
	@Test
	void testSettingFirstName() {
		Contact contact = new Contact("0000000001", "Randy", "Marsh", "5555555555", "121 W Spooner Street");
		contact.setFirstName("Stan");
		assertTrue(contact.getFirstName() == "Stan");
	}
	
//****************************LAST NAME TESTS************************************
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("0000000001", "Preston", "This name should cause an error",
				"5555555555", "This is an address");
		});
	}
	
	@Test
	void testLastNameNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("0000000001", "Brandon", null,
				"5555555555", "This is an address");
		});
	}
	
	//Tests both the set and get methods in one test
	void testSettingLastName() {
		Contact contact = new Contact("0000000001", "Eric", "Marsh", "5555555555", "121 W Spooner Street");
		contact.setLastName("Cartman");
		assertTrue(contact.getLastName() == "Cartman");
	}
	
//***********************PHONE NUMBER TESTS**************************************
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("0000000001", "Preston", "Jacobs",
				"This phone number should cause an error", "This is an address");
		});
	}
	
	@Test
	void testPhoneNumberNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("0000000001", "Andre", "Stuckert",
				null, "This is an address");
		});
	}
	
	//Tests both the set and get methods in one test
	@Test
	void testSetPhoneNumber() { 
		Contact contact = new Contact("0000000001", "Dan", "Pulkman", "8015587630", "Address");
		contact.setPhoneNumber("9957086723");
		assertTrue(contact.getPhoneNumber() == "9957086723");
	}
	
	
//************************ADDRESS TESTS*********************************************
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("0000000001", "Preston", "Jacobs",
				"5555555555", "This address is most likely longer than the maximum length allowed in this program");
		});
	}
	
	@Test
	void testAddressNotNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("0000000001", "Shelby", "Davis",
				"5555555555", null);
		});
	}
	
	//Tests both the set and get methods in one test
	@Test
	void testSetAddress() {
		Contact contact = new Contact("0000000001", "Dan", "Pulkman", "8015587630", "Address");
		contact.setAddress("156 Spooner Street, 99205");
		assertTrue(contact.getAddress() == "156 Spooner Street, 99205");
	}
	
	
}



