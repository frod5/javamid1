package lang.wrapper;

public class MyIntegerNullMain1 {
	public static void main(String[] args) {
		MyInteger[] arr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1), new MyInteger(2), new MyInteger(3)};
		System.out.println(findValue(arr, -1)); // -1
		System.out.println(findValue(arr, 0)); // 0
		System.out.println(findValue(arr, 1)); // 1
		System.out.println(findValue(arr, 100)); // null
	}

	private static MyInteger findValue(MyInteger[] arr, int target) {
		for (MyInteger i : arr) {
			if (i.getValue() == target)
				return i;
		}

		return null;
	}
}
