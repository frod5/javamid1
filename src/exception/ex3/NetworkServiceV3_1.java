package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
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
		} catch (SendExceptionV3 e) {
			System.out.println("[전송 오류] 주소: " + e.getSendData() + ", message = " + e.getMessage());
		} finally {
			client.disconnect();
		}
	}
}
