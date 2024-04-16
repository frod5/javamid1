package exception.ex4;


public class NetworkServiceV5 {
	public void sendMessage(String data) {
		String address = "http://example.com";

		// try with resources
		// catch 보다 close() 호출이 먼저됌. (더 빠른 자원해제)
		// 변수 스코프가 적어진다.
		try (NetworkClientV5 client = new NetworkClientV5(address)) { // 정상흐름
			client.initError(data);
			client.connect();
			client.send(data);
		} catch (Exception e) {
			System.out.println("[예외 확인]: " + e.getMessage());
			throw e;
		}
	}
}
