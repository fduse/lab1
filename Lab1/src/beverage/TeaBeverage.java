package beverage;

import sizeFactor.TeaBased;

public abstract class TeaBeverage extends Beverage {

	public TeaBeverage() {
		// the cost of size only related to the (base) kind of beverage
		sizeFactor = new TeaBased();
	}

	public double cost() {
		return super.cost();
	}
}
