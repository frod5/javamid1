package time;

import java.time.LocalDate;
import java.time.Period;

/**
 * 기간을 나타내는 시간에 사용
 * 두 날짜 사이의 간격을 년,월,일로 나타낼 때 사용.
 * 시,분,초 -> Duration
 * ex) 3개월, 3일, 3년 등.
 */
public class PeriodMain {
	public static void main(String[] args) {
		//생성
		Period period = Period.ofDays(10); // 10일
		System.out.println("period = " + period);

		// 계산
		LocalDate currentDate = LocalDate.of(2030, 1, 1);
		LocalDate plusDate = currentDate.plus(period);
		System.out.println("currentDate = " + currentDate);
		System.out.println("plusDate = " + plusDate);

		// 기간 차이
		LocalDate startDate = LocalDate.of(2023, 1, 1);
		LocalDate endDate = LocalDate.of(2023, 4, 2);
		Period between = Period.between(startDate, endDate);
		System.out.println("기간 = " + between.getMonths() +"개월 " + between.getDays() + "일");
	}
}
