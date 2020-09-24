package maven_jawad;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("This is Test Case 1");
    }
	
	User usertest = new User("Angie","Sandler",1234567890,"girl@deep.com","coolio123","06/10/1996","female");
	
	@Test
	public void testGetFirstName() {

		//User usertest = new User("Angie","Sandler",123456789,"girl@deep.com","coolio123","06/10/1996","female");
        usertest.getFirstName();
        assertEquals("Angie", usertest.getFirstName());
		System.out.println("Test 'getFirstName' has passed");
		
	}

	@Test
	public void testSetFirstName() {
		usertest.setFirstName("Bill");
        assertEquals("Bill", usertest.getFirstName());
		System.out.println("Test 'setFirstName' has passed");
	}

	@Test
	public void testGetLastName() {
		usertest.getLastName();
        assertEquals("Sandler", usertest.getLastName());
		System.out.println("Test 'getLastName' has passed");
	}

	@Test
	public void testSetLastName() {
		usertest.setLastName("Chowdhury");
        assertEquals("Chowdhury", usertest.getLastName());
		System.out.println("Test 'setLastName' has passed");
	}

	@Test
	public void testGetPhoneNumber() {
		usertest.getPhoneNumber();
        assertEquals(1234567890, usertest.getPhoneNumber());
		System.out.println("Test 'getPhoneNumber' has passed");
	}

	@Test
	public void testSetPhoneNumber() {
		usertest.setPhoneNumber(21498);
        assertEquals(21498, usertest.getPhoneNumber());
		System.out.println("Test 'setPhoneNumber' has passed");
	}

	@Test
	public void testGetEmailAddress() {
		usertest.getEmailAddress();
        assertEquals("girl@deep.com", usertest.getEmailAddress());
		System.out.println("Test 'getEmailAddress' has passed");
	}

	@Test
	public void testSetEmailAddress() {
		usertest.setEmailAddress("flexon@javaprogramming.com");
	    assertEquals("flexon@javaprogramming.com", usertest.getEmailAddress());
		System.out.println("Test 'setEmailAddress' has passed");
	}

	@Test
	public void testGetPassword() {
		usertest.getPassword();
        assertEquals("coolio123", usertest.getPassword());
		System.out.println("Test 'getGetPassword' has passed");
	}

	@Test
	public void testSetPassword() {
		usertest.setPassword("passyourluck");
        assertEquals("passyourluck", usertest.getPassword());
		System.out.println("Test 'setPassword' has passed");
	}

	@Test
	public void testGetBirthdate() {
		usertest.getBirthdate();
        assertEquals("06/10/1996", usertest.getBirthdate());
		System.out.println("Test 'getBirthdate' has passed");
	}

	@Test
	public void testSetBirthdate() {
		usertest.setBirthdate("04/17/1954");
        assertEquals("04/17/1954", usertest.getBirthdate());
		System.out.println("Test 'setBirthdate' has passed");
	}

	@Test
	public void testGetGender() {
		usertest.getGender();
        assertEquals("female", usertest.getGender());
		System.out.println("Test 'getGender' has passed");
	}

	@Test
	public void testSetGender() {
		usertest.setGender("other");
        assertEquals("other", usertest.getGender());
		System.out.println("Test 'setGender' has passed");
	}


}
