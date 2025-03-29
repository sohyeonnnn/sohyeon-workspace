package study.basic.exception.ex1;

public class NetworkServiceV1_1 {
    public void sendMessage(String data) {
        String address = "127.0.0.1";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
