package exception.ex2;


public class NetworkServiceV2_4 {
	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV2 client = new NetworkClientV2(address);
		client.initError(data);

		//정상 흐름과 예외 흐름 분리.
		try { // 정상흐름
			client.connect();
			client.send(data);
		} catch (NetworkClientExceptionV2 e) { // 예외 흐름
			System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
		}

		client.disconnect();
	}
}
