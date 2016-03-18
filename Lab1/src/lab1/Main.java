package lab1;

import ingredient.Chocolate;
import ingredient.Ginger;
import ingredient.Jasmine;
import ingredient.Milk;
import ingredient.WhipCream;

import java.text.DecimalFormat;

import beverage.BeveSize;
import beverage.Beverage;
import beverage.Espresso;
import beverage.GreenTea;
import beverage.HouseBlend;
import beverage.RedTea;
import beverage.WhiteTea;

public class Main {
	
	public static void main(String[] args) {	
		String[] disArr = new String[args.length];
		for (int j = 0; j < args.length; j++) {
			disArr[j] = args[j].toLowerCase();
		}
		
		dealAnOrder(disArr);
	}

	private static void dealAnOrder(String[] disArr) {
		int i;  // beverage name's length(may be 1 or 2)
		BeveSize size = BeveSize.EMPTY;  // beverage's size
		for (i = 0; i < disArr.length; i++) {
			if (disArr[i].equals("small")) {
				size = BeveSize.SMALL;
				break;
			} else if (disArr[i].equals("medium")) {
				size = BeveSize.MEDIUM;
				break;
			} else if (disArr[i].equals("large")) {
				size = BeveSize.LARGE;
				break;
			} else if (disArr[i].equals("grant")) {
				size = BeveSize.GRANT;
				break;
			}
		}

		if (i >= disArr.length) {
			showIllegalInput("Must set a size!");
			return;
		}

		// get beverage's name
		String beveStr = disArr[0] + ((i == 2) ? " " + disArr[1] : "");  
		
		// create base beverage
		Beverage order;
		if (beveStr.equals("espresso")) {
			order = new Espresso();
			order.setSize(size);
		} else if (beveStr.equals("houseblend")) {
			order = new HouseBlend();
			order.setSize(size);
		} else if (beveStr.equals("mocha")) {
			order = new Espresso();
			order.setSize(size);
			order = new Chocolate(order);
		} else if (beveStr.equals("latte")) {
			order = new Espresso();
			order.setSize(size);
			order = new Milk(order);
		} else if (beveStr.equals("cappuccino")) {
			order = new Espresso();
			order.setSize(size);
			order = new WhipCream(order);
		} else if (beveStr.equals("green tea")) {
			order = new GreenTea();
			order.setSize(size);
		} else if (beveStr.equals("red tea")) {
			order = new RedTea();
			order.setSize(size);
		} else if (beveStr.equals("white tea")) {
			order = new WhiteTea();
			order.setSize(size);
		} else if (beveStr.equals("flower tea")) {
			order = new GreenTea();
			order.setSize(size);
			order = new Jasmine(order);
		} else if (beveStr.equals("ginger tea")) {
			order = new GreenTea();
			order.setSize(size);
			order = new Ginger(order);
		} else if (beveStr.equals("tea latte")) {
			order = new RedTea();
			order.setSize(size);
			order = new Milk(order);
		} else {
			showIllegalInput(beveStr);
			return;
		}


		// add ingredient
		for (i++; i < disArr.length; i++) {
			if (disArr[i].equals("chocolate")) {
				order = new Chocolate(order);
			} else if (disArr[i].equals("ginger")) {
				order = new Ginger(order);
			} else if (disArr[i].equals("milk")) {
				order = new Milk(order);
			} else if (disArr[i].equals("jasmine")) {
				order = new Jasmine(order);
			} else if (disArr[i].equals("whip")) {
				i++;  // 2 words "whip cream"
				order = new WhipCream(order);
			} else {
				showIllegalInput(disArr[i]);
			}
		}

		/**
		 * How do I get the description of each order instead of doing this
		 * stupid thing forever (except for printing the args)?
		 */
		/*if (order instanceof BeverageWithIngredient) {
			((BeverageWithIngredient) order).getDescription();
		} else if (order instanceof Espresso) {
			((Espresso) order).getDescription();
		}*/
		// and so on...

		System.out.println("The order is:" + order.getDescription());
		
		DecimalFormat df = new DecimalFormat(".0");
		System.out.println("The total cost of your order is: "
				+ df.format(order.cost()));
	}
	
	private static void showIllegalInput(String errMsg) {
		System.err.println("Illegal input:" + errMsg);
	}
}