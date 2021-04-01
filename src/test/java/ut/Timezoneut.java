package ut;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ms.timezone.Timezone;

public class Timezoneut {

	static Timezone cl ;
	
	@BeforeClass
	  public static void setUp() {
	   cl = new Timezone();
	  }

	  @AfterClass
	  public static void tearDown()  {
	  System.gc();
	  }

	  @Test
	  public void testIndia() {
	 assertEquals(cl.doIndia("2019-02-07T18:36"),"07-Feb-2019 06:36 PM");
	  }
	  
	  @Test
	  public void testEurope() {
	 assertEquals(cl.doEurope("2019-02-07T18:36"),"07-Feb-2019 02:06 PM");
	  }
	  
	  @Test
	  public void testAus() {
	 assertEquals(cl.doAus("2019-02-07T18:36"),"08-Feb-2019 12:06 AM");
	  }
	  
	  @Test
	  public void testEast() {
	 assertEquals(cl.doEast("2019-02-07T18:36"),"07-Feb-2019 08:06 AM");
	  }
	  
	  @Test
	  public void testCentral() {
	 assertEquals(cl.doCentral("2019-02-07T18:36"),"07-Feb-2019 07:06 AM");
	  }
	  
	  @Test
	  public void testWest() {
	 assertEquals(cl.doWest("2019-02-07T18:36"),"07-Feb-2019 11:06 AM");
	  }
	  
}
