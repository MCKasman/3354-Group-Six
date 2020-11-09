// LoginTest.java

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before Test Case");
	}
	
	@Test
	public void correctUserAndPass() {
		System.out.println("Here is the test for correct username & password");
		
		// create User object
		User account = new User();
		
		// 1) correct test case, correct username & password
		assertEquals("Here is the test for correct username & password", true, account.verifyLogin("Sid.Devic@utdallas.edu","imACMawesome"));
	}
	
	@Test
	public void wrongUser() {
		System.out.println("Here is the test for wrong username only");
		
		// create User object
		User account = new User();
		// 2) incorrect test case, wrong username only
			assertEquals("Here is the test for wrong username only", false, account.verifyLogin("wrong.email@utdallas.edu","imACMawesome"));
	}
	
	@Test
	public void wrongPass() {
		System.out.println("Here is the test for wrong password only");
		
		// create User object
		User account = new User();
		// 3) incorrect test case, wrong password only
		assertEquals("Here is the test for wrong password only", false, account.verifyLogin("Sid.Devic@utdallas.edu","wrongpassword"));
	}
	
	@Test
	public void wrongUserAndPass() {
		System.out.println("Here is the test for wrong username & password");
		
		// create User object
		User account = new User();
		// 4) incorrect test case, wrong username & password
		assertEquals("Here is the test for wrong username & password", false, account.verifyLogin("wrong.email@utdallas.edu","wrongpassword"));
	}	
	
	@Test
	public void emptyUserAndPass() {
		System.out.println("Here is the test for empty username & password");
		
		// create User object
		User account = new User();
		// 5) incorrect test case, empty username & password
		assertEquals("Here is the test for empty username & password", false, account.verifyLogin("",""));
	}	
	
	@Test
	public void emptyUser() {
		System.out.println("Here is the test for empty username only");
		
		// create User object
		User account = new User();
		// 6) incorrect test case, empty username only
		assertEquals("Here is the test for empty username only", false, account.verifyLogin("","imACMawesome"));
	}	
	
	@Test
	public void emptyPass() {
		System.out.println("Here is the test for empty password only");
		
		// create User object
		User account = new User();
		// 7) incorrect test case, empty password only
		assertEquals("Here is the test for empty password only", false, account.verifyLogin("Sid.Devic@utdallas.edu",""));
	}	
	
	
	@After
	public void after() {
		System.out.println("After Test Case");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
