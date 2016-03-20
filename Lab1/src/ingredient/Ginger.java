package ingredient;

import beverage.BeveType;
import beverage.Beverage;

public class Ginger extends BeverageWithIngredient {

	public Ginger(Beverage drink) {
		super(drink, BeveType.TEA);
	}

	public String getDescription() {
		return super.getDescription() + " ginger";
	}
	
	public double cost() {
		return 0.6 + super.cost();
	}
}