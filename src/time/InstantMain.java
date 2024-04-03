package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
	public static void main(String[] args) {
		//Instant -> 1970/1/1 0시 0분 0초 부터 현재 까지 경과한 시간을 '초'로 관리함. (UTC)
		Instant now = Instant.now();
		System.out.println("now = " + now);

		ZonedDateTime zdt = ZonedDateTime.now();
		Instant from = Instant.from(zdt);
		System.out.println("from = " + from);

		Instant epochStart = Instant.ofEpochSecond(0);
		System.out.println("epochStart = " + epochStart);

		// 계산
		Instant later = epochStart.plusSeconds(3600);
		System.out.println("later = " + later);

		//조회
		long laterEpochSecond = later.getEpochSecond();
		System.out.println("laterEpochSecond = " + laterEpochSecond);
	}
}
