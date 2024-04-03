package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
	public static void main(String[] args) {
		ChronoUnit[] values = ChronoUnit.values();
		for (ChronoUnit value : values) {
			System.out.println("value = " + value);
		}

		System.out.println("HOURS : " + ChronoUnit.HOURS);
		System.out.println("HOURS.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
		System.out.println("DAYS = " + ChronoUnit.DAYS);
		System.out.println("DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());

		//차이 구하기
		LocalTime start = LocalTime.of(1, 10, 0);
		LocalTime end = LocalTime.of(1, 20, 0);

		long secondsBetween = ChronoUnit.SECONDS.between(start, end);
		System.out.println("secondsBetween = " + secondsBetween);

		long minutesBetween = ChronoUnit.MINUTES.between(start, end);
		System.out.println("minutesBetween = " + minutesBetween);
	}
}
