package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
	public static void main(String[] args) {
		//포맷 : 날짜/시간 -> 문자
		LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatted = now.format(formatter);
		System.out.println("formatted = " + formatted);

		//파싱 : 문자 -> 날짜/시간
		LocalDateTime parsed = LocalDateTime.parse(formatted, formatter);
		System.out.println("parsed = " + parsed);
	}
}
