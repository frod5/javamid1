package lang.immutable.address;

public class RefMain2 {
	public static void main(String[] args) {
		//참조형 변수는 인스턴스를 공유할 수 있다.
		//불변 객체 도입으로 변경 막기.
		ImmutableAddress a = new ImmutableAddress("서울");
		ImmutableAddress b = a;

		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// b.setValue("부산"); 부산으로 변경해야되는데 불변 객체라 변경을 하지 못함.
		b = new ImmutableAddress("부산"); // 생성으로밖에 변경을 하지못함. 공유를 못함
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
