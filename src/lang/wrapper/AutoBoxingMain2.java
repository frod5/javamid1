package lang.wrapper;

public class AutoBoxingMain2 {
	public static void main(String[] args) {
		//primitive -> wrapper
		int value = 10;
		Integer boxedValue = value; // 오토 박싱

		// wrapper -> primitive
		int unboxedValue = boxedValue; // 오토 언박싱

		System.out.println("boxedValue = " + boxedValue);
		System.out.println("unboxedValue = " + unboxedValue);

		//오토 박싱, 언박싱은 컴파일러가 .valueOf(), .longValue() 이런것들로 바꿔준다.
	}
}
