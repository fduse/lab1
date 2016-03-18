package ingredient;

import beverage.Beverage;

public class Milk extends BeverageWithIngredient {
	
	public Milk(Beverage drink) {
		super(drink);
	}

	public String getDescription() {
		return super.getDescription() + " milk";
	}
	
	public double cost() {
		return 0.3 + super.cost();
	}
}
