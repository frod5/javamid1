package enumeration.test;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 등급을 입력하세요" + Arrays.toString(AuthGrade.values()) + ": ");
		String input = sc.nextLine();
		AuthGrade inputGrade = AuthGrade.valueOf(input.toUpperCase());
		int level = inputGrade.getLevel();

		System.out.println("당신의 등급은 " + inputGrade.getDescription() + "입니다.");
		System.out.println("==메뉴 목록==");

		if(level >= 1) {
			System.out.println("- 메인 화면");
		}

		if(level >= 2) {
			System.out.println("- 이메일 관리 화면");
		}

		if(level >= 3) {
			System.out.println("- 관리자 화면");
		}
	}
}
