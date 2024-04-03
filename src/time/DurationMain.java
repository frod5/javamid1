package time;

import java.time.Duration;
import java.time.LocalTime;

/**
 * 두 날짜의 시간을 시,분,초로 나타낸다.
 * 필드에 '초'만 들고 있어서 getSecond()가 있음
 * 시, 분 -> toHours(), toMinutes() 무언가 계산해서 돌려줌
 */
public class DurationMain {
	public static void main(String[] args) {
		Duration duration = Duration.ofMinutes(30); //30분
		System.out.println("duration = " + duration);

		LocalTime lt = LocalTime.of(1, 0);
		System.out.println("lt = " + lt);

		//계산에 사용
		LocalTime plusTime = lt.plus(duration);
		System.out.println("plusTime = " + plusTime);

		//시간 차이
		LocalTime startTime = LocalTime.of(9, 0);
		LocalTime endTime = LocalTime.of(10, 0);
		Duration between = Duration.between(startTime, endTime);
		System.out.println("차이 = " + between.getSeconds() + "초");
		System.out.println("근무 시간: " + between.toHours() + "시간 " + between.toMinutesPart() + "분");
	}
}
