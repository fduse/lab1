package test.beverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.Decaf;

public class DecafTest {
	Decaf d;
	@Before
	public void setUp() throws Exception {
		d=new Decaf();
		d.setSize(BeveSize.SMALL);
	}
	@Test
	public void testCost() {
		Assert.assertEquals(0.9, d.cost(), 0);//0.4+0.5=0.9
	}

	@Test
	public void testGetDescription() {
		
	}

}
