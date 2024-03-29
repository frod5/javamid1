package lang.string.equals;

public class StringEqualsMain2 {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("메소드 호출 비교1: " + isSame(str1, str2));

		String str3 = "hello";
		String str4 = "hello";
		System.out.println("메소드 호출 비교2: " + isSame(str3, str4));
	}

	private static boolean isSame(String x, String y) {
		// return x == y; 파라미터로 들어오는 문자열이 new String()으로 만든건지, 리터럴로 만든지를 모르기 때문에 항상 equals로 비교해야한다.
		return x.equals(y);
	}
}
