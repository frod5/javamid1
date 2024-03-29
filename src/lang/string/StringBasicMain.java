package lang.string;

public class StringBasicMain {
	public static void main(String[] args) {
		String str1 = "hello"; // String은 클래스이다.
		String str2 = new String("hello"); //자바는 쌍따옴표로 문자열을 감싸면, 자바언어에서 new String()으로 변환해준다.

		System.out.println(str1);
		System.out.println(str2);
	}
}
