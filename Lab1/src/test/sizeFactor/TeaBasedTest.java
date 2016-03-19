package test.sizeFactor;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import beverage.BeveSize;

import sizeFactor.TeaBased;

public class TeaBasedTest {

	TeaBased tb;

	@Before
	public void setUp() throws Exception {
		tb = new TeaBased();
	}

	@Test(timeout = 1000)
	public void testSizeCost() {
		Assert.assertEquals(0.2, tb.sizeCost(BeveSize.SMALL), 0);
		Assert.assertEquals(0.5, tb.sizeCost(BeveSize.MEDIUM), 0);
		Assert.assertEquals(0.7, tb.sizeCost(BeveSize.LARGE), 0);
		Assert.assertEquals(0.9, tb.sizeCost(BeveSize.GRANT), 0);
	}

}
