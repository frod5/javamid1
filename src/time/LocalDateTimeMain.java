package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
	public static void main(String[] args) {
		LocalDateTime nowDt = LocalDateTime.now();
		LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

		System.out.println("현재 시간 = " + nowDt);
		System.out.println("지정 시간 = " + ofDt);

		//날짜와 시간 분리
		LocalDate localDate = ofDt.toLocalDate();
		LocalTime localTime = ofDt.toLocalTime();
		System.out.println("localDate = " + localDate);
		System.out.println("localTime = " + localTime);

		//날짜와 시간 합체
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		System.out.println("localDateTime = " + localDateTime);

		// 계산(불변)
		LocalDateTime ofDtPlus = ofDt.plusDays(1000);
		System.out.println("지정	날짜시간 + 1000일 = " + ofDtPlus);
		LocalDateTime ofDtPlusYear = ofDt.plusYears(1);
		System.out.println("지정 날짜시간 + 1년 = " + ofDtPlusYear);

		// 비교
		System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));
		System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));
		System.out.println("현재 날짜시간이 지정 날짜시간이 같은가? " + nowDt.isEqual(ofDt)); // isEqual()은 객체도 다르고 타임존이 달라도 시간만 같은면 true. ex) utc 0시와 서울 9시와 같은 시간. 그냥 equals는 객체타입, 타임존 모두 같아야 true
	}
}
