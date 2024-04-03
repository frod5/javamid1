package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
	public static void main(String[] args) {
		//포맷 : 날짜 -> 문자
		LocalDate date = LocalDate.of(2024, 12, 31);
		System.out.println("date = " + date);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String formattedDate = date.format(formatter);
		System.out.println("formattedDate = " + formattedDate);

		//파싱 : 문자 -> 날짜
		String input = "2030년 01월 11일";
		LocalDate parsedDate = LocalDate.parse(input, formatter);
		System.out.println("parsedDate = " + parsedDate);
	}
}
