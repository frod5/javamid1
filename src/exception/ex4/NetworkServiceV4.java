package exception.ex4;


public class NetworkServiceV4 {
	public void sendMessage(String data) {
		String address = "http://example.com";
		NetworkClientV4 client = new NetworkClientV4(address);
		client.initError(data);

		//정상 흐름과 예외 흐름 분리.
		try { // 정상흐름
			client.connect();
			client.send(data);
		} finally {
			client.disconnect();
		}
	}
}
