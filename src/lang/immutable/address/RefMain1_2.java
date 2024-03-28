package lang.immutable.address;

public class RefMain1_2 {
	public static void main(String[] args) {
		//서로다른 참조를 가지게하여 공유를 끊음
		Address a = new Address("서울");
		Address b = new Address("서울");

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		b.setValue("부산");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
