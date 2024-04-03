package time;

import java.time.LocalTime;

public class LocalTimeMain {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		LocalTime ofTime = LocalTime.of(9, 10, 30);

		System.out.println("현재시간 = " + now);
		System.out.println("지정시간 = " + ofTime);

		//계산(불변)
		ofTime = ofTime.plusHours(1);
		System.out.println("지정시간 + 1H = " + ofTime);
	}
}
