package ingredient;

import java.util.Arrays;

import beverage.BeveSize;
import beverage.BeveType;
import beverage.Beverage;

public abstract class BeverageWithIngredient extends Beverage {
	
	private Beverage drink;

	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
	}
	
	// 接受可变参数（该饮料允许加入的配料），如果加入的配料不合适，则给出警告但不阻止
	public BeverageWithIngredient(Beverage drink, BeveType... types) {
		if (!Arrays.asList(types).contains(drink.getType())) {
			System.err.printf("Warning: This may not be suitable for %s beverage.\n", drink.getType().toString());
		}
		this.drink = drink;
	}
	
	public double cost() {
		return drink.cost();
	}
	
	// getter & setter
	public String getDescription(){
		return drink.getDescription();
	}
	
	public Beverage getDrink() {
		return drink;
	}
	
	public BeveType getType() {
		return drink.getType();
	}
	
	public void setSize(BeveSize size) {
		/*
		 * beverage with ingredient 类不能再 set size 了，这里直接重载了方法的实现，输出错误提示
		 * 本来这样不好，因为 beverage 若是有更多的不能 set size 的子类，都得这样覆盖。所以应该要用策略模式之类
		 * 但是因为这里是装饰者模式，比较特殊，只可能有一个 beverage with ingredient 类
		 * 所以我觉得这样做可以接受
		 */
		System.err.println("error: cannot change size when adding ingredient!");
	}
}
