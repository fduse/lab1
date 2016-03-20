package beverage;

import sizeFactor.CoffeeBased;

public abstract class CoffeeBeverage extends Beverage {

	public CoffeeBeverage() {
		// the cost of size only related to the (base) kind of beverage
		sizeFactor = new CoffeeBased();
		type = BeveType.COFFEE;
	}
	
	public double cost() {
		return super.cost();
	}
}
