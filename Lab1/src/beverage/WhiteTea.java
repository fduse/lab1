package beverage;


public class WhiteTea extends TeaBeverage {
	
	public String getDescription() {
		return "White Tea";
	}

	public double cost() {
		return super.cost() + 1.0;
	}
}
