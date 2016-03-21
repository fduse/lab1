package test.lab1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import lab1.Main;
import beverage.BeveSize;
import beverage.Beverage;
import beverage.Espresso;
import beverage.HouseBlend;
import beverage.Decaf;
import beverage.GreenTea;
import beverage.RedTea;
import beverage.WhiteTea;





import org.junit.Test;

public class MainTest {


    
	@Test(timeout=1000)
	public void test() throws Exception{
		Assert.assertEquals(2.0, Main.dealAnOrder("espresso small milk milk".split(" ")), 0.01);//1+0.4+0.3+0.3=2.0
		Assert.assertEquals(1.5, Main.dealAnOrder("decaf medium chocolate".split(" ")), 0.01);//0.5+0.7+0.3=1.5
		Assert.assertEquals(2.1, Main.dealAnOrder("houseblend large whip cream".split(" ")), 0.01);//0.8+1.0+0.3=2.1
		Assert.assertEquals(2.9, Main.dealAnOrder("mocha grant milk".split(" ")), 0.01);//0.4+0.5=0.9
		Assert.assertEquals(1.7, Main.dealAnOrder("cappuccino small".split(" ")), 0.01);//0.4+0.5=0.9
		Assert.assertEquals(1.5, Main.dealAnOrder("green tea small milk".split(" ")), 0.01);//0.4+0.5=0.9
		Assert.assertEquals(1.5, Main.dealAnOrder("white tea medium".split(" ")), 0.01);//0.4+0.5=0.9
		Assert.assertEquals(4.6, Main.dealOrders("2 mocha small milk milk ; white tea large ginger".split(" ")), 0.01);//1.0+0.3+0.4+0.3+0.3+1+0.7+0.6=4.6
		Assert.assertEquals(4.1, Main.dealOrders("2 decaf small chocolate whip cream ; red tea large ginger jasmine".split(" ")), 0.01);//0.5+0.4+0.3+0.3+0.8+0.7+0.6+0.5=4.1
		
	}

}
