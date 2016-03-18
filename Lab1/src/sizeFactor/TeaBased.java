package sizeFactor;

import beverage.BeveSize;

public class TeaBased implements SizeFactor {

	@Override
	public double sizeCost(BeveSize size) {
		switch (size) {
		case SMALL:
			return 0.2;
		case MEDIUM:
			return 0.5;
		case LARGE:
			return 0.7;
		default:  // GRANT
			return 0.9;				
		}
	}

}
