package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
	private int outInstanceVar = 3;

	public Printer process(int param) {
		int localVar = 1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

		class LocalPrinter implements Printer {
			int value = 0;

			@Override
			public void print() {
				System.out.println("value = " + value);

				//인스턴스는 지역변수 보다 더 오래 사라남는다.
				System.out.println("localVar = " + localVar);
				System.out.println("param = " + param);
				System.out.println("outInstanceVar = " + outInstanceVar);
			}
		}

		LocalPrinter localPrinter = new LocalPrinter();
		//만약 localVar를 변경한다면? 다시 캡처해야하나?
		// localVar = 10; 컴파일오류
		// param = 20; 컴파일 오류
		return localPrinter;
	}

	public static void main(String[] args) {
		LocalOuterV4 localOuterV1 = new LocalOuterV4();
		Printer printer = localOuterV1.process(2);
		printer.print(); // process()의 스택 프레임이 사라진 이후에 실행

		System.out.println("필드 확인"); // 지역 변수 캡처 확인
		for (Field declaredField : printer.getClass().getDeclaredFields()) {
			System.out.println("declaredField = " + declaredField);
		}
	}
}
