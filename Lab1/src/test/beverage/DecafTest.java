package test.beverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.Decaf;

public class DecafTest {
	Decaf ds,dm,dl,dg;
	@Before
	public void setUp() throws Exception {
		ds=new Decaf();
		ds.setSize(BeveSize.SMALL);
		dm=new Decaf();
		dm.setSize(BeveSize.MEDIUM);
		dl=new Decaf();
		dl.setSize(BeveSize.LARGE);
		dg=new Decaf();
		dg.setSize(BeveSize.GRANT);
	}
	@Test(timeout=1000)
	public void testCost() {
		Assert.assertEquals(0.9, ds.cost(), 0);//0.4+0.5=0.9
		Assert.assertEquals(1.2, dm.cost(), 0);//0.7+0.5=1.2
		Assert.assertEquals(1.5, dl.cost(), 0);//1.0+0.5=1.5
		Assert.assertEquals(1.8, dg.cost(), 0);//1.3+0.5=1.8

		
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("Decaf", ds.getDescription());
		Assert.assertEquals("Decaf", dm.getDescription());
		Assert.assertEquals("Decaf", dl.getDescription());
		Assert.assertEquals("Decaf", dg.getDescription());
	}

}
