package study.basic.exception.ex3;

public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "127.0.0.1";
        //NetworkClientV2 client = new NetworkClientV2(address);
        //NetworkClientV4 client = new NetworkClientV4(address);

        try(NetworkClientV5 client = new NetworkClientV5(address)){
            client.initError(data);
            client.connect();
            client.send(data);
        }catch (Exception e) {
            System.out.println("에러 catch");
            throw e;
        }
    }
}
