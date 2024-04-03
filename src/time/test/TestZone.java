package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
	public static void main(String[] args) {
		LocalDateTime meetingDateTime = LocalDateTime.of(2024, 1, 1, 9, 0);
		ZonedDateTime seoul = ZonedDateTime.of(meetingDateTime, ZoneId.of("Asia/Seoul"));

		ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
		ZonedDateTime newyork = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));

		System.out.println("seoul = " + seoul);
		System.out.println("london = " + london);
		System.out.println("newyork = " + newyork);
	}
}
