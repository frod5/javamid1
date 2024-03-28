package lang.object;

//부모가 없으면 묵시적으 Object class를 상속받는다.
public class Parent {  // extends Object 생략

	public void parentMethod() {
		System.out.println("Parent.parentMethod");
	}

	@Override
	public String toString() {
		return "test";
	}
}
