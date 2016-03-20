package test.beverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.GreenTea;

public class GreenTeaTest {

	GreenTea gts,gtm,gtl,gtg;
	@Before
	public void setUp() throws Exception {
		gts=new GreenTea();
		gts.setSize(BeveSize.SMALL);
		gtm=new GreenTea();
		gtm.setSize(BeveSize.MEDIUM);
		gtl=new GreenTea();
		gtl.setSize(BeveSize.LARGE);
		gtg=new GreenTea();
		gtg.setSize(BeveSize.GRANT);
	}
	@Test(timeout=1000)
	public void testCost() {						//size+beverage
		Assert.assertEquals(1.2, gts.cost(), 0.01);//0.2+1.0=1.2
		Assert.assertEquals(1.5, gtm.cost(), 0.01);//0.5+1.0=1.5
		Assert.assertEquals(1.7, gtl.cost(), 0.01);//0.7+1.0=1.7
		Assert.assertEquals(1.9, gtg.cost(), 0.01);//0.9+1.0=1.9

		
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("Green Tea", gts.getDescription());
		Assert.assertEquals("Green Tea", gtm.getDescription());
		Assert.assertEquals("Green Tea", gtl.getDescription());
		Assert.assertEquals("Green Tea", gtg.getDescription());
	}


}
