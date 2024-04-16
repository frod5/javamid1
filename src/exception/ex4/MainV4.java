package exception.ex4;

import java.util.Scanner;

import exception.ex4.exception.SendExceptionV4;

public class MainV4 {
	public static void main(String[] args) {
		// NetworkServiceV4 service = new NetworkServiceV4();
		NetworkServiceV5 service = new NetworkServiceV5();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("전송할 문자 : ");
			String input = sc.nextLine();

			if (input.equals("exit")) {
				break;
			}

			try {
				service.sendMessage(input);
			} catch (Exception e) {
				exceptionHandler(e);
			}
			System.out.println();
		}
		System.out.println("프로그램을 정상 종료합니다.");
	}


	// 공통 예외 처리
	private static void exceptionHandler(Exception e) {
		//공통 처리
		System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생 하였습니다.");
		System.out.println("== 개발자용 디버깅 메시지 ==");

		e.printStackTrace(System.out); //스택 트레이 출력
		// e.printStackTrace();

		// e.printStackTrace(System.out) vs e.printStackTrace()
		// e.printStackTrace() 은 System.err 라는 표준 오류에 결과 출력

		// 필요하면 예외별로 별도 처리 가능
		if(e instanceof SendExceptionV4 sendEx) {
			System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
		}
	}
}
