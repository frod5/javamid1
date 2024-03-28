package lang.object.tostring;

public class ToStringMain1 {
	public static void main(String[] args) {
		Object o = new Object();
		String string = o.toString();

		//toString() 출력
		System.out.println("string = " + string);

		//객체 출력
		System.out.println("o = " + o);
	}
}
