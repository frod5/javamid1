package lang.wrapper;

public class AutoBoxingMain1 {
	public static void main(String[] args) {
		//primitive -> wrapper
		int value = 10;
		Integer boxedValue = Integer.valueOf(value); // 박싱

		// wrapper -> primitive
		int unboxedValue = boxedValue.intValue(); // 언박싱

		System.out.println("boxedValue = " + boxedValue);
		System.out.println("unboxedValue = " + unboxedValue);
	}
}
