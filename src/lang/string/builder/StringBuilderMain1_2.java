package lang.string.builder;

public class StringBuilderMain1_2 {
	public static void main(String[] args) {
		//가변 String (StringBuilder)
		StringBuilder sb = new StringBuilder();

		// method chaining
		String str = sb.append("A").append("B").append("C").append("D")
			.insert(4, "Java")
			.delete(4, 8)
			.reverse()
			.toString();

		System.out.println("str = " + str);
	}
}
