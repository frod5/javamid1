package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {
	public static void main(String[] args) {
		// 현재시간을 밀리초로 가져온다.
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println("currentTimeMillis = " + currentTimeMillis);

		// 현재시간을 나노초로 가져온다.
		long currentTimeNano = System.nanoTime();
		System.out.println("currentTimeNano = " + currentTimeNano);

		// 환경 변수를 읽는다. (운영체제)
		System.out.println("getenv() : " + System.getenv());

		// 시스템 속성을 읽는다. (자바가 사용하는 변수)
		System.out.println("propertiees: " + System.getProperties());
		System.out.println("Java version: " + System.getProperty("java.version"));

		//배열을 고속으로 복사한다. 하드웨어사용해서 한다.
		char[] originArr = {'h', 'e', 'l', 'l', 'o'};
		char[] copiedArr = new char[5];

		// 반복문으로 만드는것보다 빠르다
		System.arraycopy(originArr, 0, copiedArr, 0, originArr.length);

		//배열 출력
		System.out.println("copiedArr = " + Arrays.toString(copiedArr));

		// 프로그램 종료
		System.exit(0);
	}
}
