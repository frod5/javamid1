package enumeration.ex2;

public class ClassGradeEx2_2 {
	public static void main(String[] args) {
		int price = 10000;
		DiscountService discountService = new DiscountService();
		// ClassGrade newGrade = new ClassGrade();
		// int result = discountService.discount(newGrade, price);
		// System.out.println("result = " + result);

		// 타입 안전 열거형 패턴
		// 타입 안정성 향상 -> 정해진 객체만 사용가능.
		// 데이터 일관성 -> 정해진 객체만 사용하기 떄문에 일관성 보장.
	}
}
