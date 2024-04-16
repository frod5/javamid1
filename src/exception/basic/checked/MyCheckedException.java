package exception.basic.checked;

/**
 * Exception을 상속받은 클래스는 checked Exception이 된다.
 */
public class MyCheckedException extends Exception {
	public MyCheckedException(String message) {
		super(message);
	}
}
