package lang.object.equals;

public class EqualsMainV2 {
	public static void main(String[] args) {
		UserV2 user1 = new UserV2("id-100");
		UserV2 user2 = new UserV2("id-100");

		// 동일성 - 객체의 참조값이 같은 경우(물리적으로 같음) '==' 비교
		// false
		System.out.println("identity = " + (user1 == user2));

		// 동등성 - 논리적으로 같은 데이터면 같은경우 equals() 비교
		// true -> 기본 equals는 동일성으로 제공. equals 오버라이딩했기때문
		System.out.println("equality = " + (user1.equals(user2)));
	}
}
