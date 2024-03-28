package lang.object;

public class Child extends Parent { //명시적으로 다른것을 상속받으면 Object를 상속받지 않는다. (하지만 Parent에는 Object를 상속받기 때문에)
	public void childMethod() {
		System.out.println("Child.childMethod");
	}
}
