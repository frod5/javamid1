package lang.immutable.test;

public class ImmutableMyDate {
	private final int year;
	private final int month;
	private final int day;

	public ImmutableMyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//불변객체인 경우 보통 값을 변경하는경우 withXxx로 시작하는 경우가 많다
	//원본객체도 유지되면서 변경사항이 적용된 새 객체를 만들어서 사용하는경우 관례로 많이 사용한다.
	public ImmutableMyDate withYear(int year) {
		return new ImmutableMyDate(year, month, day);
	}

	public ImmutableMyDate withMonth(int month) {
		return new ImmutableMyDate(year, month, day);
	}
	public ImmutableMyDate withDay(int day) {
		return new ImmutableMyDate(year, month, day);
	}
	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}
}
