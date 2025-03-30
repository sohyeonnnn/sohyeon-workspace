package study.basic.exception.ex3;

public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "127.0.0.1";
        //NetworkClientV2 client = new NetworkClientV2(address);
        NetworkClientV4 client = new NetworkClientV4(address);

        client.initError(data);

        try{
            client.connect();
            client.send(data);
        }finally {
            client.disconnect();
        }
    }
}
