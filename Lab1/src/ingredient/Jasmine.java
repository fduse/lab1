package ingredient;

import beverage.BeveType;
import beverage.Beverage;

public class Jasmine extends BeverageWithIngredient {
	
	public Jasmine(Beverage drink) {
		super(drink, BeveType.TEA);
	}

	public String getDescription() {
		return super.getDescription() + " jasmine";
	}
	
	public double cost() {
		return 0.5 + super.cost();
	}
}
