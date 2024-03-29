package lang.string.method;

public class StringUtilMain1 {
	public static void main(String[] args) {
		int num = 100;
		boolean bool = true;
		Object obj = new Object();
		String str = "Hello, Java!";

		//valueOf()
		String numString = String.valueOf(num);
		System.out.println("숫자의 문자열 값 = " + numString);
		String boolString = String.valueOf(bool);
		System.out.println("boolean의 문자열 값 = " + boolString);
		String objString = String.valueOf(obj);
		System.out.println("객체의 문자열 값 = " + objString);

		String numString2 = "" + num; // 문자열 + 숫자 -> 문자열
		System.out.println("빈문자 + num = " + numString2);

		//toCharArray()
		char[] strCharArr = str.toCharArray();
		System.out.println("문자열을 문자 배열로 변환: " + strCharArr);
		for (char c : strCharArr) {
			System.out.print(c);
		}
		System.out.println();
	}
}
