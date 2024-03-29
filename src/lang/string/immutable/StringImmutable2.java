package lang.string.immutable;

public class StringImmutable2 {
	public static void main(String[] args) {
		//String은 불변 객체
		String str1 = "hello";
		String str2 = str1.concat(" java");

		System.out.println("str1 = " + str1); //기본 값 유지
		System.out.println("str2 = " + str2); //.concat()은 hello java문자열을 새로 만든다.
	}
}
