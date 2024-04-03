package enumeration.ex1;

public class DiscountService {

	public int discount(String grade, int price) {
		int discountPercent = switch (grade) {
			case StringGrade.BASIC -> 10;
			case StringGrade.GOLD -> 20;
			case StringGrade.DIAMOND -> 30;
			default -> {
				System.out.println(grade + ": 할인 X");
				yield  0;
			}
		};

		return price * discountPercent / 100;
	}
}
