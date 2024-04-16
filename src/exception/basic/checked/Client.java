package exception.basic.checked;

public class Client {
	public void call() throws MyCheckedException {
		//문제 사항
		throw new MyCheckedException("ex");
	}
}
