package beverage;

public class Decaf extends CoffeeBeverage {

	public String getDescription() {
		return "Decaf";
	}

	public double cost() {
		return super.cost() + 0.5;
	}
}
