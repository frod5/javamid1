package lang.wrapper;

public class WrapperClassMain {
	public static void main(String[] args) {
		Integer newInteger = new Integer(10); // @Deprecated 미래에 삭제 예정 Integer.valueOf(); 권장
		Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 값 재사용.

		Long longObj = Long.valueOf(10);
		Double doubleObj = Double.valueOf(10.5);

		System.out.println("newInteger = " + newInteger);
		System.out.println("integerObj = " + integerObj);
		System.out.println("longObj = " + longObj);
		System.out.println("doubleObj = " + doubleObj);

		System.out.println("내부 값 읽기");
		int intValue = integerObj.intValue();
		System.out.println("intValue = " + intValue);
		long longValue = longObj.longValue();
		System.out.println("longValue = " + longValue);

		System.out.println("비교");
		System.out.println("==: " + (newInteger == integerObj));
		System.out.println("equals:" + (newInteger.equals(integerObj)));

		//래퍼클래스를 생성하는 것은 박싱 ex) xxx.valueOf()
		//래버클래스의 값을 꺼내는 것은 언박싱 ex) xxx.intValue(), xxx.longValue()
		//비교는 equals로 해야함.
	}
}
