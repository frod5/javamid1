package enumeration.ex1;


public class StringGradeEx1_1 {
	public static void main(String[] args) {
		int price = 10000;
		DiscountService discountService = new DiscountService();

		// 문자열 상수 사용.
		// 오타나 데이터 일관성은 안전해졌다
		// 하지만 상수를 사용하지 않고 아무 문자열을 입력하더라도 컴파일오류 나지 않음 (타입 안정성 부족)
		int basic = discountService.discount(StringGrade.BASIC, price);
		int gold = discountService.discount(StringGrade.GOLD, price);
		int diamond = discountService.discount(StringGrade.DIAMOND, price);

		System.out.println("basic = " + basic);
		System.out.println("gold = " + gold);
		System.out.println("diamond = " + diamond);
	}
}
