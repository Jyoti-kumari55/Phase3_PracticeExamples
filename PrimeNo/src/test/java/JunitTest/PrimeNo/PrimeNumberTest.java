package JunitTest.PrimeNo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrimeNumberTest {

	PrimeNumber n;
	 @Before
	 public void objeccreation() {
		 System.out.println("Obj created **");
	 n=new PrimeNumber();
	 }

	
	 @Test
	 public void test1() {
	  assertTrue("Check prime number or not:",n.prime(0));
	  assertEquals(false,n.prime(18));
}
	 @Test
	 public void test2() {
	  assertTrue("Check prime number or not:",n.prime(2));
	  assertEquals(false,n.prime(15));
	 }
	 
	 @After
	 public void destroyobj() {
		 System.out.println("Object destroyed !!");
	 n=null;
	 }

	private void assertEquals(boolean b, boolean prime) {
		// TODO Auto-generated method stub
		
	}

	private void assertTrue(String string, boolean prime) {
		// TODO Auto-generated method stub
		
	}
}
