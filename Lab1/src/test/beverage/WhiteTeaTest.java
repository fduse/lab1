package test.beverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.WhiteTea;

public class WhiteTeaTest {
	
	WhiteTea wts,wtm,wtl,wtg;
	@Before
	public void setUp() throws Exception {
		wts=new WhiteTea();
		wts.setSize(BeveSize.SMALL);
		wtm=new WhiteTea();
		wtm.setSize(BeveSize.MEDIUM);
		wtl=new WhiteTea();
		wtl.setSize(BeveSize.LARGE);
		wtg=new WhiteTea();
		wtg.setSize(BeveSize.GRANT);
	}
	@Test(timeout=1000)
	public void testCost() {						//size+beverage
		Assert.assertEquals(1.2, wts.cost(), 0.01);//0.2+1.0=1.2
		Assert.assertEquals(1.5, wtm.cost(), 0.01);//0.5+1.0=1.5
		Assert.assertEquals(1.7, wtl.cost(), 0.01);//0.7+1.0=1.7
		Assert.assertEquals(1.9, wtg.cost(), 0.01);//0.9+1.0=1.9

		
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("White Tea", wts.getDescription());
		Assert.assertEquals("White Tea", wtm.getDescription());
		Assert.assertEquals("White Tea", wtl.getDescription());
		Assert.assertEquals("White Tea", wtg.getDescription());
	}

}
