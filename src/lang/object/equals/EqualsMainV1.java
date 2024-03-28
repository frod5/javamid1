package lang.object.equals;

public class EqualsMainV1 {
	public static void main(String[] args) {
		UserV1 user1 = new UserV1("id-100");
		UserV1 user2 = new UserV1("id-100");

		// 동일성 - 객체의 참조값이 같은 경우(물리적으로 같음) '==' 비교
		// false
		System.out.println("identity = " + (user1 == user2));

		// 동등성 - 논리적으로 같은 데이터면 같은경우 equals() 비교
		// false -> 기본 equals는 동일성으로 제공하기 때문 어떤 논리로 동일한지는 오버라이딩해야함
		System.out.println("equality = " + (user1.equals(user2)));
	}
}
