package test.beverage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.Espresso;

public class EspressoTest {
	Espresso es,em,el,eg;
	
	@Before
	public void setUp() throws Exception {
		es=new Espresso();
		es.setSize(BeveSize.SMALL);
		em=new Espresso();
		em.setSize(BeveSize.MEDIUM);
		el=new Espresso();
		el.setSize(BeveSize.LARGE);
		eg=new Espresso();
		eg.setSize(BeveSize.GRANT);
	}
	@Test(timeout=1000)
	public void testCost() {
		Assert.assertEquals(1.4, es.cost(), 0.01);//0.4+1.0=1.4
		Assert.assertEquals(1.7, em.cost(), 0.01);//0.7+1.0=1.7
		Assert.assertEquals(2.0, el.cost(), 0.01);//1.0+1.0=2.0
		Assert.assertEquals(2.3, eg.cost(), 0.01);//1.3+1.0=2.3

		
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("Esspresso", es.getDescription());
		Assert.assertEquals("Esspresso", em.getDescription());
		Assert.assertEquals("Esspresso", el.getDescription());
		Assert.assertEquals("Esspresso", eg.getDescription());
	}
		

}
