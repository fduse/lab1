package test.beverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.HouseBlend;

public class HouseBlendTest {

	HouseBlend hbs,hbm,hbl,hbg;
	
	@Before
	public void setUp() throws Exception {
		hbs=new HouseBlend();
		hbs.setSize(BeveSize.SMALL);
		hbm=new HouseBlend();
		hbm.setSize(BeveSize.MEDIUM);
		hbl=new HouseBlend();
		hbl.setSize(BeveSize.LARGE);
		hbg=new HouseBlend();
		hbg.setSize(BeveSize.GRANT);
	}
	@Test(timeout=1000)
	public void testCost() {
		Assert.assertEquals(1.2, hbs.cost(), 0.01);//0.4+0.8=1.2
		Assert.assertEquals(1.5, hbm.cost(), 0.01);//0.7+0.8=1.5
		Assert.assertEquals(1.8, hbl.cost(), 0.01);//1.0+0.8=1.8
		Assert.assertEquals(2.1, hbg.cost(), 0.01);//1.3+0.8=2.1

		
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("HouseBlend", hbs.getDescription());
		Assert.assertEquals("HouseBlend", hbm.getDescription());
		Assert.assertEquals("HouseBlend", hbl.getDescription());
		Assert.assertEquals("HouseBlend", hbg.getDescription());
	}
		

}
