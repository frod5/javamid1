package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("년도를 입력하세요: ");
		int year = sc.nextInt();

		System.out.print("월을 입력하세요: ");
		int month = sc.nextInt();

		printCalendar(year, month);
	}

	private static void printCalendar(int year, int month) {
		LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
		LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

		// 월요일 = 1, 일요일은 7
		int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

		System.out.println("Su Mo Tu We Th Fr Sa ");
		for (int i = 0; i < offsetWeekDays; i++) {
			System.out.print("   ");
		}

		while(firstDayOfMonth.isBefore(firstDayOfNextMonth)) {
			System.out.printf("%2d ", firstDayOfMonth.getDayOfMonth());
			if(firstDayOfMonth.getDayOfWeek() == DayOfWeek.SATURDAY) {
				System.out.println();
			}
			firstDayOfMonth = firstDayOfMonth.plusDays(1);
		}
	}
}
