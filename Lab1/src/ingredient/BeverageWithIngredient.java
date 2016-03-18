package ingredient;

import beverage.Beverage;

public class BeverageWithIngredient extends Beverage {
	private Beverage drink;
	protected String description;

	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double cost() {
		return drink.cost();
	}
}
