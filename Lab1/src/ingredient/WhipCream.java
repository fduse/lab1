package ingredient;

import beverage.BeveType;
import beverage.Beverage;

public class WhipCream extends BeverageWithIngredient {
	
	public WhipCream(Beverage drink) {
		super(drink, BeveType.COFFEE);
	}

	public String getDescription() {
		return super.getDescription() + " whip";
	}
	
	public double cost() {
		return 0.3 + super.cost();
	}
}
