package ingredient;

import beverage.Beverage;

public class Jasmine extends BeverageWithIngredient {
	
	public Jasmine(Beverage drink) {
		super(drink);
	}

	public String getDescription() {
		return super.getDescription() + " jasmine";
	}
	
	public double cost() {
		return 0.5 + super.cost();
	}
}
