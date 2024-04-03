package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		boolean supported = now.isSupported(ChronoField.HOUR_OF_DAY); // 필드 지원하는지 여부
		System.out.println("supported = " + supported);
		if (supported) {
			int i = now.get(ChronoField.HOUR_OF_DAY);
			System.out.println("i = " + i);
		}
	}
}
