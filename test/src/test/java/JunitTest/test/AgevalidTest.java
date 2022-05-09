package JunitTest.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AgevalidTest {

	Agevalidator valid;
	
	@Before
	public void objeccreation() {
		System.out.println("obj created");
		valid=new Agevalidator();
	}

	@Test
	public void test1() {
		System.out.println("test1");
		assertEquals("valid age to vote",valid.ageValid(20));
	}
	
	
	@Test
	public void test2() {
		System.out.println("test2");
		assertEquals("valid age to vote",valid.ageValid(28));
	}
	
	
	@Test
	public void test3() {
		System.out.println("test3");
		assertEquals("check the age ",valid.ageValid(8));
	}
	
	
	@After
	public void destroyobj() {
		System.out.println("object destroyed");
		valid=null;
	}


}
