package lang.object;

public class ObjectMain {
	public static void main(String[] args) {
		Child child = new Child();
		child.childMethod();
		child.parentMethod();

		//toString()은 Object 클래스의 메소드
		String string = child.toString();
		System.out.println("string = " + string);

		//정리 - 자바의 최종 부모는 Object이다.
	}
}
