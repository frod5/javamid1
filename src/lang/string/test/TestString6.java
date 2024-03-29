package lang.string.test;

public class TestString6 {
	public static void main(String[] args) {
		String str = "start hello java. hello spring. hello jpa";
		String key = "hello";
		int result = 0;
		int result1 = 0;

		//내 풀이
		String[] split = str.split(" ");
		for (String s : split) {
			if(s.indexOf(key) != -1) result++;
		}

		//강의 풀이
		int index = str.indexOf(key);
		while(index >= 0) {
			result1++;
			index = str.indexOf(key, index + 1);
		}

		System.out.println("result = " + result);
		System.out.println("result1 = " + result1);
	}
}
