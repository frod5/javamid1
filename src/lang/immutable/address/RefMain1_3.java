package lang.immutable.address;

public class RefMain1_3 {
	public static void main(String[] args) {
		//참조형 변수는 인스턴스를 공유할 수 있다.
		Address a = new Address("서울");
		Address b = a;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		change(a, "부산"); // 메소드로 기능이 되어있는 경우 사이드이펙트를 알아채기 힘들다.
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	private static void change(Address address, String changeAddress) {
		System.out.println("주소 값을 변경합니다 -> " + changeAddress);
		address.setValue(changeAddress);
	}
}
