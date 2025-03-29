package study.basic.exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String address = "127.0.0.1";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
