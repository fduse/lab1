package test.ingredient;

import ingredient.Jasmine;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import beverage.BeveSize;
import beverage.Beverage;
import beverage.GreenTea;
import beverage.RedTea;
import beverage.WhiteTea;

import org.junit.Test;

public class JasmineTest {
	/* since our test should cover the menu. We should cover:
	 * flowertea
	 * We know that Jasmine is a tea ingredient
	 * so we should cover all kinds of tea.
	 * My test data include 
	 * small flowertea, medium whitetea with a Jasmine, large redtea with two Jasmine, grant flowertea with three Jasmine
	 * which means
	 * small greentea with a ginger, medium read tea with a ginger...
	 * and the abbr is fs,wmj,rl2j,fg3j
	 * */
	Beverage order;
	Jasmine fs,wmj,rl2j,fg3j;
	
	@Before
	public void setUp() throws Exception {
		order=new GreenTea();
		order.setSize(BeveSize.SMALL);
		fs=new Jasmine(order);
		
		order=new WhiteTea();
		order.setSize(BeveSize.MEDIUM);
		wmj=new Jasmine(order);
		
		order=new RedTea();
		order.setSize(BeveSize.LARGE);
		order=new Jasmine(order);
		rl2j=new Jasmine(order);
		
		order=new GreenTea();
		order.setSize(BeveSize.GRANT);
		order=new Jasmine(order);
		order=new Jasmine(order);
		fg3j=new Jasmine(order);
	}
	
	@Test(timeout=1000)
	public void testCost() {						//size+beverage+ingredient
		Assert.assertEquals(1.7, fs.cost(), 0.01);//0.2+1.0+0.5*1=1.7
		Assert.assertEquals(2.0, wmj.cost(), 0.01);//0.5+1.0+0.5*1=2.0
		Assert.assertEquals(2.5, rl2j.cost(), 0.01);//0.7+0.8+0.5*2=2.5
		Assert.assertEquals(3.4, fg3j.cost(), 0.01);//0.9+1.0+0.5*3=3.4
	}

	@Test(timeout=1000)
	public void testGetDescription() {
		Assert.assertEquals("Green Tea jasmine", fs.getDescription());
		Assert.assertEquals("White Tea jasmine", wmj.getDescription());
		Assert.assertEquals("Red Tea jasmine jasmine", rl2j.getDescription());
		Assert.assertEquals("Green Tea jasmine jasmine jasmine", fg3j.getDescription());
	}

}
