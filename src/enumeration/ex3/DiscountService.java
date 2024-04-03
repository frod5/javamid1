package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class DiscountService {

	public int discount(Grade grade, int price) {
		int discountPercent = switch (grade) {
			case BASIC -> 10;
			case Grade.GOLD -> 20;
			case Grade.DIAMOND -> 30;
		};

		return price * discountPercent / 100;
	}
}
