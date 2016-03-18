package sizeFactor;

import beverage.BeveSize;

public class CoffeeBased implements SizeFactor {

	@Override
	public double sizeCost(BeveSize size) {
		switch (size) {
		case SMALL:
			return 0.4;
		case MEDIUM:
			return 0.7;
		case LARGE:
			return 1.0;
		default:  // GRANT
			return 1.3;				
		}
	}

}
