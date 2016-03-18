package beverage;

public class RedTea extends TeaBeverage {

	public String getDescription() {
		return "Red Tea";
	}

	public double cost() {
		return super.cost() + 0.8;
	}
}
