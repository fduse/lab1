package test.ingredient;

import ingredient.WhipCream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.Beverage;
import beverage.Espresso;
import beverage.HouseBlend;
import beverage.Decaf;

public class WhipCreamTest {
	/*our test data should cover default menu with WhipCream
	 * Cappuccino,Decaf Cappuccino
	 * with all kinds of size. and user can define their own drink
	 * so I choose small cappuccino, medium decaf Cappuccino,large espresso with 2 WhipCream, grant houseblend with 3 WhipCream
	 * which means small espresso+WhipCream,medium decaf+WhipCream,large espresso+2*WhipCream,grant houseblend+3*WhipCream
	 * these four test data include all kinds of coffee with all kinds of size with 1 2 3 houseblend.
	 * the abbr of them is cs,dmw,el2w,hg3w
	 */
	WhipCream cs,dmw,el2w,hg3w;
	Beverage order;
	@Before
	public void setUp() throws Exception {
		order=new Espresso();
		order.setSize(BeveSize.SMALL);
		cs = new WhipCream(order);
		
		order=new Decaf();
		order.setSize(BeveSize.MEDIUM);
		dmw= new WhipCream(order);
		
		order=new Espresso();
		order.setSize(BeveSize.LARGE);
		order=new WhipCream(order);
		el2w=new WhipCream(order);
		
		order=new HouseBlend();
		order.setSize(BeveSize.GRANT);
		order=new WhipCream(order);
		order=new WhipCream(order);
		hg3w=new WhipCream(order);
	}
	
	@Test(timeout=1000)
	public void testCost() {						//size+beverage+ingredient
		Assert.assertEquals(1.7, cs.cost(), 0.01);//0.4+1.0+0.3*1=1.7
		Assert.assertEquals(1.5, dmw.cost(), 0.01);//0.7+0.5+0.3*1=1.5
		Assert.assertEquals(2.6, el2w.cost(), 0.01);//1.0+1.0+0.3*2=2.6
		Assert.assertEquals(3.0, hg3w.cost(), 0.01);//1.3+0.8+0.3*3=3.0
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("Esspresso whip", cs.getDescription());
		Assert.assertEquals("Decaf whip", dmw.getDescription());
		Assert.assertEquals("Esspresso whip whip", el2w.getDescription());
		Assert.assertEquals("HouseBlend whip whip whip", hg3w.getDescription());
	}


}
