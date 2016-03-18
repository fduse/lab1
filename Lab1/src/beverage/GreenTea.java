package beverage;


public class GreenTea extends TeaBeverage {

	public String getDescription() {
		return "Green Tea";
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
