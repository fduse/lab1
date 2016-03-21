package ingredient;

import beverage.BeveType;
import beverage.Beverage;

public class Chocolate extends BeverageWithIngredient {

	public Chocolate(Beverage drink) {
		super(drink, BeveType.COFFEE);
	}



	public String getDescription() {
		return super.getDescription() + " chocolate";
	}

	public double cost() {
		return 0.3 + super.cost();
	}
}
