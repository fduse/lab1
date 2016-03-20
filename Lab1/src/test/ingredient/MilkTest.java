package test.ingredient;

import ingredient.Milk;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.Beverage;
import beverage.Espresso;
import beverage.HouseBlend;
import beverage.Decaf;
import beverage.GreenTea;
import beverage.RedTea;
import beverage.WhiteTea;

public class MilkTest {
	/*our test data should cover default menu with milk
	 * Latte,decaf Latte, Tea Latte
	 * and milk can add to any beverage.
	 * so I choose small Latte, medium decaf Latte,large Tea Latte , grant Houseblend with 2 milk, small greentea with 3 milk,medium whitetea milk with 4 milk
	 * which means small espresso+milk,medium decaf+milk,large redtea+milk,
	 * grant Houseblend+2*milk,small green tea+3*milk,medium white tea 4*milk
	 * the abbr of them is ls,dmm,tlm,hg2m,gs3m,wm4m
	 */
	Beverage order;
	Milk ls,dmm,tlm,hg2m,gs3m,wm4m;
	
	@Before
	public void setUp() throws Exception {
		order=new Espresso();
		order.setSize(BeveSize.SMALL);
		ls = new Milk(order);
		
		order=new Decaf();
		order.setSize(BeveSize.MEDIUM);
		dmm= new Milk(order);
		
		order=new RedTea();
		order.setSize(BeveSize.LARGE);
		tlm= new Milk(order);
		
		order=new HouseBlend();
		order.setSize(BeveSize.GRANT);
		order=new Milk(order);
		hg2m=new Milk(order);
		
		order=new GreenTea();
		order.setSize(BeveSize.SMALL);
		order=new Milk(order);
		order=new Milk(order);
		gs3m=new Milk(order);
		
		order=new WhiteTea();
		order.setSize(BeveSize.MEDIUM);
		order=new Milk(order);
		order=new Milk(order);
		order=new Milk(order);
		wm4m=new Milk(order);
	}
	
	@Test(timeout=1000)
	public void testCost() {						//size+beverage+ingredient
		Assert.assertEquals(1.7, ls.cost(), 0.01);//0.4+1.0+0.3*1=1.7
		Assert.assertEquals(1.5, dmm.cost(), 0.01);//0.7+0.5+0.3*1=1.5
		Assert.assertEquals(1.8, tlm.cost(), 0.01);//0.7+0.8+0.3*1=1.8
		Assert.assertEquals(2.7, hg2m.cost(), 0.01);//1.3+0.8+0.3*2=2.7
		Assert.assertEquals(2.1, gs3m.cost(), 0.01);//0.2+1.0+0.3*3=2.1
		Assert.assertEquals(2.7, wm4m.cost(), 0.01);//0.5+1.0+0.3*4=2.7
		
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("Esspresso milk", ls.getDescription());
		Assert.assertEquals("Decaf milk", dmm.getDescription());
		Assert.assertEquals("Red Tea milk", tlm.getDescription());
		Assert.assertEquals("HouseBlend milk milk", hg2m.getDescription());
		Assert.assertEquals("Green Tea milk milk milk", gs3m.getDescription());
		Assert.assertEquals("White Tea milk milk milk milk", wm4m.getDescription());
	}



}
