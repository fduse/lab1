package beverage;

import sizeFactor.CoffeeBased;

public abstract class CoffeeBeverage extends Beverage {

	public CoffeeBeverage() {
		// the cost of size only related to the (base) kind of beverage
		super.sizeFactor = new CoffeeBased();
	}
	
	public double cost() {
		return super.cost();
	}
}
