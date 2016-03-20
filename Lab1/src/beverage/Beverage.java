package beverage;

import sizeFactor.SizeFactor;

public abstract class Beverage {
	
	BeveSize size;
	BeveType type;
	SizeFactor sizeFactor;

	// only have cost of size
	public double cost() {
		return sizeFactor.sizeCost(size);
	}
	
	// abstract method
	public abstract String getDescription();

	// getter & setter
	public BeveSize getSize() {
		return size;
	}
	
	public void setSize(BeveSize size) {
		this.size = size;
	}
	
	public BeveType getType() {
		return type;
	}
	
	// is coffee or tea ?
	//public Beverage getBaseBeverage() {
	//	return (this instanceof BeverageWithIngredient) ? ((BeverageWithIngredient) this).getDrink().getBaseBeverage() : this;
	//}
}
