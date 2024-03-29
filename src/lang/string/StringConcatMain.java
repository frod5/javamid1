package lang.string;

public class StringConcatMain {
	public static void main(String[] args) {
		String a = "hello";
		String b = " java";

		String result1 = a.concat(b);
		String result2 = a + b; //클래스형은 변수에 참조값을 가지고 있어서 + 연산이 되지 않지만, String만 예외.
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
	}
}
