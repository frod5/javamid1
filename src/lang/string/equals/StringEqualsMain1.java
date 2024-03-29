package lang.string.equals;

public class StringEqualsMain1 {
	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");

		System.out.println("new String() == 비교 " + (str1 == str2)); //동일성 비교는 참조값비교라 false
		System.out.println("new String() equals 비교 " + (str1.equals(str2))); //동등성 비교는 같은 문자열로 true

		String str3 = "hello";
		String str4 = "hello";

		// 자바에서 문자열 리터럴을 사용하면 메모리 효율과, 성능 최적화를 위해 문자열 풀을 이용한다.
		// 자바 실행시점에 문자열 리터럴이 있으면 문자열풀에 인스턴스만든다. 이 떄 같은 문자열이 있으면 만들지 않는다.
		// 1. str3에서 hello라는 문자열을 문자열 풀에 인스턴스 생성
		// 2. str4에서 기존에 문자열풀에서 hello 인스턴스를 찾아 참조값을 넣어준다.
		System.out.println("리터럴 == 비교 " + (str3 == str4)); // true
		System.out.println("리터럴 equals 비교 " + (str3.equals(str4))); // true
	}
}
