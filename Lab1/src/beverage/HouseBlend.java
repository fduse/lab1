package beverage;

public class HouseBlend extends CoffeeBeverage {

	public String getDescription() {
		return "HouseBlend";
	}

	public double cost() {
		return super.cost() + 0.8;
	}
}
