package lang.string.test;

public class TestString2 {
	public static void main(String[] args) {
		String[] strArr = {"hello", "java", "jvm", "spring", "jpa"};
		int totalLength = 0;
		for (String s : strArr) {
			int length = s.length();
			System.out.println(s + ":" + length);
			totalLength += length;
		}
		System.out.println("totalLength = " + totalLength);
	}
}
