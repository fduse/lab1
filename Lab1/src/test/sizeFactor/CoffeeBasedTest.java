package test.sizeFactor;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import beverage.BeveSize;
import sizeFactor.CoffeeBased;

public class CoffeeBasedTest {
	CoffeeBased cb;

	@Before
	public void setUp() throws Exception {
		cb = new CoffeeBased();
	}

	@Test(timeout = 1000)
	public void testSizeCost() {
		Assert.assertEquals(0.4, cb.sizeCost(BeveSize.SMALL), 0);
		Assert.assertEquals(0.7, cb.sizeCost(BeveSize.MEDIUM), 0);
		Assert.assertEquals(1.0, cb.sizeCost(BeveSize.LARGE), 0);
		Assert.assertEquals(1.3, cb.sizeCost(BeveSize.GRANT), 0);
	}

}
