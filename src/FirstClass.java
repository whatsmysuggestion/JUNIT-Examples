import org.junit.*;
import static org.junit.Assert.*;

public class FirstClass 
{
	//@Test
	//@Test(timeout=9)
	@Test(expected=ArithmeticException.class)
	 public void testing() { 	
		
		
	 DummyTestCase dt=new DummyTestCase();  
	 
	 assertEquals(4,dt.div(2,0));
		/*
		 * assertEquals(4,dt.addition(2,2));
		 * 
		 * assertTrue(dt.getRes()); assertFalse(dt.getRes()); assertNull(dt.getNull());
		 * assertNotNull(dt.getData());
		 */
	  //assertEquals("abc",dt.getData()); 	 
	 
      }

}
 










//@Test(timeout=9)
		//@Test(expected=ArithmeticException.class)
	 
	 // assertEquals("abc",dt.getData()); 	 
		
		
		 // assertTrue(dt.getRes());
		  //assertFalse(dt.getRes()); 
		 // assertNull(dt.getNull());
		  //assertNotNull(dt.getData());
		 
//
//

