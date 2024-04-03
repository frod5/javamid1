package enumeration.ex0;

public class DiscountService {

	public int discount(String grade, int price) {
		int discountPercent = switch (grade) {
			case "BASIC" -> 10;
			case "GOLD" -> 20;
			case "DIAMOND" -> 30;
			default -> {
				System.out.println(grade + ": 할인 X");
				yield  0;
			}
		};

		return price * discountPercent / 100;
	}
}
