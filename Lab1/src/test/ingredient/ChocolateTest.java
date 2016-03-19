package test.ingredient;

import ingredient.Chocolate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.Beverage;

public class ChocolateTest {
	Chocolate c; 
	Beverage b;
	@Before
	public void setUp() throws Exception {
		c = new Chocolate(b);
	}
	
	@Test
	public void testCost() {
		
	}

	@Test
	public void testGetDescription() {
	}

}
