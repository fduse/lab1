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
			if (disArr[i].matches("^small$|^medium$|^large$|^grant$")) {
				size = BeveSize.valueOf(disArr[i].toUpperCase());
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
		switch (beveStr) {
		case "espresso":
			order = new Espresso();
			order.setSize(size);
			break;
		case "houseblend":
			order = new HouseBlend();
			order.setSize(size);
			break;
		case "mocha":
			order = new Espresso();
			order.setSize(size);
			order = new Chocolate(order);
			break;
		case "latte":
			order = new Espresso();
			order.setSize(size);
			order = new Milk(order);
			break;
		case "cappuccino":
			order = new Espresso();
			order.setSize(size);
			order = new WhipCream(order);
			break;
		case "green tea":
			order = new GreenTea();
			order.setSize(size);
			break;
		case "red tea":
			order = new RedTea();
			order.setSize(size);
			break;
		case "white tea":
			order = new WhiteTea();
			order.setSize(size);
			break;
		case "flower tea":
			order = new GreenTea();
			order.setSize(size);
			order = new Jasmine(order);
			break;
		case "ginger tea":
			order = new GreenTea();
			order.setSize(size);
			order = new Ginger(order);
			break;
		case "tea latte":
			order = new RedTea();
			order.setSize(size);
			order = new Milk(order);
			break;
		default:
			showIllegalInput(beveStr);
			return;
		}



		// add ingredient
		for (i++; i < disArr.length; i++) {
			switch (disArr[i]) {
			case "chocolate":
				order = new Chocolate(order);
				break;
			case "ginger":
				order = new Ginger(order);
				break;
			case "milk":
				order = new Milk(order);
				break;
			case "jasmine":
				order = new Jasmine(order);
				break;
			case "whip":
				i++;
				order = new WhipCream(order);
				break;
			default:
				showIllegalInput(disArr[i]);
				return;
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

		System.out.println("The order is: " + order.getDescription());
		
		DecimalFormat df = new DecimalFormat(".0");
		System.out.println("The total cost of your order is: "
				+ df.format(order.cost()));
	}
	
	private static void showIllegalInput(String errMsg) {
		System.err.println("Illegal input:" + errMsg);
	}
}