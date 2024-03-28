package lang.immutable.change;

public class ImmutableObj {
	private final int value;

	public ImmutableObj(int value) {
		this.value = value;
	}

	public ImmutableObj add(int addValue) {
		//불변객체는 기존 값을 변경하지 않고 새로운 값읆 만들어서 리턴
		return new ImmutableObj(this.value + addValue);
	}

	public int getValue() {
		return value;
	}
}
