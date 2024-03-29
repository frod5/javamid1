package lang.string.immutable;

public class StringImmutable1 {
	public static void main(String[] args) {
		//String은 불변 객체
		String str = "hello";
		str.concat(" java");
		System.out.println("str = " + str);
	}
}
