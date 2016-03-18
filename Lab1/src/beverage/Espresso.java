package beverage;

public class Espresso extends CoffeeBeverage {

	public String getDescription() {
		return "Esspresso";
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
