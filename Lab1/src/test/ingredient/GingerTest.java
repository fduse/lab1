package test.ingredient;

import ingredient.Ginger;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.Beverage;
import beverage.GreenTea;
import beverage.RedTea;
import beverage.WhiteTea;

public class GingerTest {
	/* since our test should cover the menu. We should cover:
	 * gingertea
	 * We know that ginger is a tea ingredient
	 * so we should cover all kinds of tea.
	 * My test data include 
	 * small gingertea, medium red tea with a ginger, large whitetea with two ginger, grant gingertea with three ginger
	 * which means
	 * small greentea with a ginger, medium read tea with a ginger...
	 * and the abbr is gs,rmg,wl2g,gg3g
	 * */
	Beverage order;
	Ginger gs,rmg,wl2g,gg3g;
	
	@Before
	public void setUp() throws Exception {
		order=new GreenTea();
		order.setSize(BeveSize.SMALL);
		gs=new Ginger(order);
		
		order=new RedTea();
		order.setSize(BeveSize.MEDIUM);
		rmg=new Ginger(order);
		
		order=new WhiteTea();
		order.setSize(BeveSize.LARGE);
		order=new Ginger(order);
		wl2g=new Ginger(order);
		
		order=new GreenTea();
		order.setSize(BeveSize.GRANT);
		order=new Ginger(order);
		order=new Ginger(order);
		gg3g=new Ginger(order);
	}
	
	@Test(timeout=1000)
	public void testCost() {						//size+beverage+ingredient
		Assert.assertEquals(1.8, gs.cost(), 0.01);//0.2+1.0+0.6*1=1.8
		Assert.assertEquals(1.9, rmg.cost(), 0.01);//0.5+0.8+0.6*1=1.9
		Assert.assertEquals(2.9, wl2g.cost(), 0.01);//0.7+1.0+0.6*2=2.9
		Assert.assertEquals(3.7, gg3g.cost(), 0.01);//0.9+1.0+0.6*3=3.7
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("Green Tea ginger", gs.getDescription());
		Assert.assertEquals("Red Tea ginger", rmg.getDescription());
		Assert.assertEquals("White Tea ginger ginger", wl2g.getDescription());
		Assert.assertEquals("Green Tea ginger ginger ginger", gg3g.getDescription());
	}

}
