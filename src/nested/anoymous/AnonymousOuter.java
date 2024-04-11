package nested.anoymous;

import nested.local.Printer;

public class AnonymousOuter {
	private int outInstanceVar = 3;

	public void process(int param) {
		int localVar = 1;

		//익명클래스
		//상속받거나 인터페이스만 익명클래스로 할 수 있다.
		//단 한번만 인스턴스 생성.
		Printer printer = new Printer() {
			int value = 0;

			@Override
			public void print() {
				System.out.println("value = " + value);
				System.out.println("localVar = " + localVar);
				System.out.println("param = " + param);
				System.out.println("outInstanceVar = " + outInstanceVar);
			}
		};

		printer.print();
		System.out.println("printer.getClass() = " + printer.getClass());
	}

	public static void main(String[] args) {
		AnonymousOuter main = new AnonymousOuter();
		main.process(2);
	}
}
