package lang.string.builder;

public class LoopStringBuilderMain {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("Hello, Java!");
		}
		long endTime = System.currentTimeMillis();

		System.out.println("result = " + sb.toString());
		System.out.println("time = " + (endTime - startTime));

		//0.3초 걸림

		// 대부분 문자열 연결은 + 연산자로 해도 자바 내에서 최적화가 잘 되서 사용해도 된다. (컴파일러 최적화 등등)
		// 컴파일러 최적화
		// 1. 문자열 리터럴 최적화
		// 컴파일 전에 String str = "Hello" + " Java"; -> 컴파일 후엔 알아서 String str = "Hello Java";로 최적화
		// 2. String 변수 최적화
		// String result = str1 + str2; -> String result = new StringBuilder().append(str1).append(str2).toString();
		// 자바 9 부터는 StringConcatFactory를 사용한다.

		// 다만 아래 경우들은 StringBuilder를 사용하는게 좋다. (컴파일 시점에 알 수가 없어서)
		// 1. 반복에서 반해서 문자를 연결할 때.
		// 2. 조건문을 통해 동적으로 문자열을 조합할 때.
		// 3. 복잡한 문자열의 특정 부분을 변경해야할 때.
		// 4. 매우 긴 대용량 문자열을 다룰 때.

		// 참고
		// StringBuilder vs StringBuffer
		// 1. StringBuffer는 내부 동기화가 되어 있어서, 멀티 스레드 상황에 안전하지만 동기화 오버헤드로 인해 성능이 느리다.
		// 2. StringBuilder는 멀티 스레드 상황에 동기화가 없어서, 안전하지 않지만 빠르다.
	}
}
