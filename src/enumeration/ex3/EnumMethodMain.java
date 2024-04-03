package enumeration.ex3;

import java.util.Arrays;

/**
 * Enum 주요 메소드
 */
public class EnumMethodMain {
	public static void main(String[] args) {

		//모든 Enum 반환 .values()
		Grade[] values = Grade.values();
		System.out.println("values = " + Arrays.toString(values));

		for (Grade value : values) {
			//.name() ENUM명, .ordinal() 순서
			System.out.println("name = " + value.name() + " ordinal = " + value.ordinal());
		}

		//String -> Enum 변환, 잘못된 문자열이면 Exception 발생.
		String input = "GOLD";
		Grade gold = Grade.valueOf(input);
		System.out.println("gold = " + gold); //기본 toString()은 상수 이름으로 되어있지만 오버라이딩 가능.
	}
}
