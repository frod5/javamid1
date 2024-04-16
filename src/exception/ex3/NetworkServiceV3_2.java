package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV3 client = new NetworkClientV3(address);
		client.initError(data);

		//정상 흐름과 예외 흐름 분리.
		try { // 정상흐름
			client.connect();
			client.send(data);
		} catch (ConnectExceptionV3 e) {
			System.out.println("[연결 오류] 주소: " + e.getAddress() + ", message = " + e.getMessage());
		} catch (NetworkClientExceptionV3 e) {
			System.out.println("[네트워크 오류] message = " + e.getMessage());
		} catch (Exception e) {
			System.out.println("[알 수 없는 오류] message = " + e.getMessage());
		} finally {
			client.disconnect();
		}
	}
}
