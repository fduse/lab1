package ingredient;

import beverage.Beverage;

public abstract class BeverageWithIngredient extends Beverage {
	
	private Beverage drink;

	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
	}
	
	public String getDescription(){
		return drink.getDescription();
	}
	
	public double cost() {
		return drink.cost();
	}
}
