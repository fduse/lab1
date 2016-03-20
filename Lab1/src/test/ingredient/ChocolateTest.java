package test.ingredient;

import ingredient.Chocolate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.Beverage;
import beverage.Espresso;
import beverage.HouseBlend;
import beverage.Decaf;

public class ChocolateTest {
	/*our test data should cover default menu with chocolate
	 * mocha,decaf mocha
	 * with all kinds of size. and user can define their own drink
	 * so I choose small mocha, medium decaf mocha,large houseblend with 2 chocolate, grant decaf with 3 chocolate
	 * which means small espresso+chocolate,medium decaf+chocolate,large housblend+2*chocolate,grant decaf+3*chocolate
	 * these four test data include all kind of coffee with all kind of size with 1 2 3 chocolate.
	 * the abbr of them is ms,dmm,hl2c,dg3c
	 */
	Chocolate ms,dmm,hl2c,dg3c; 
	Beverage order;
	@Before
	public void setUp() throws Exception {
		order=new Espresso();
		order.setSize(BeveSize.SMALL);
		ms = new Chocolate(order);
		
		order=new Decaf();
		order.setSize(BeveSize.MEDIUM);
		dmm= new Chocolate(order);
		
		order=new HouseBlend();
		order.setSize(BeveSize.LARGE);
		order=new Chocolate(order);
		hl2c=new Chocolate(order);
		
		order=new Decaf();
		order.setSize(BeveSize.GRANT);
		order=new Chocolate(order);
		order=new Chocolate(order);
		dg3c=new Chocolate(order);
	}
	
	@Test
	public void testCost() {						//size+beverage+ingredient
		Assert.assertEquals(1.7, ms.cost(), 0.01);//0.4+1.0+0.3*1=1.7
		Assert.assertEquals(1.5, dmm.cost(), 0.01);//0.7+0.5+0.3*1=1.5
		Assert.assertEquals(2.4, hl2c.cost(), 0.01);//1.0+0.8+0.3*2=2.4
		Assert.assertEquals(2.7, dg3c.cost(), 0.01);//1.3+0.5+0.3*3=2.7
	}

	@Test
	public void testGetDescription() {
		Assert.assertEquals("Esspresso chocolate", ms.getDescription());
		Assert.assertEquals("Decaf chocolate", dmm.getDescription());
		Assert.assertEquals("HouseBlend chocolate chocolate", hl2c.getDescription());
		Assert.assertEquals("Decaf chocolate chocolate chocolate", dg3c.getDescription());
	}

}
