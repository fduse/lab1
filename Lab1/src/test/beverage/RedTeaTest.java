package test.beverage;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.RedTea;

public class RedTeaTest {

	RedTea rts,rtm,rtl,rtg;
	@Before
	public void setUp() throws Exception {
		rts=new RedTea();
		rts.setSize(BeveSize.SMALL);
		rtm=new RedTea();
		rtm.setSize(BeveSize.MEDIUM);
		rtl=new RedTea();
		rtl.setSize(BeveSize.LARGE);
		rtg=new RedTea();
		rtg.setSize(BeveSize.GRANT);
	}
	@Test(timeout=1000)
	public void testCost() {						//size+beverage
		Assert.assertEquals(1.0, rts.cost(), 0.01);//0.2+0.8=1.0
		Assert.assertEquals(1.3, rtm.cost(), 0.01);//0.5+0.8=1.3
		Assert.assertEquals(1.5, rtl.cost(), 0.01);//0.7+0.8=1.5
		Assert.assertEquals(1.7, rtg.cost(), 0.01);//0.9+0.8=1.7

		
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("Red Tea", rts.getDescription());
		Assert.assertEquals("Red Tea", rtm.getDescription());
		Assert.assertEquals("Red Tea", rtl.getDescription());
		Assert.assertEquals("Red Tea", rtg.getDescription());
	}


}
