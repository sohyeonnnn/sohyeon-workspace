package study.basic.exception.ex2;

public class NetworkServiceV2 {
    public void sendMessage(String data) {
        String address = "127.0.0.1";
        //NetworkClientV2 client = new NetworkClientV2(address);
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data);

        try{
            client.connect();
            client.send(data);
        }catch (NetworkConnectExceptionV3 e) {

            System.out.println(" 연결 오류 ! ! ! " + e.getMessage());
        }catch (NetworkSendExceptionV3 e) {
            System.out.println(" 전송 오류 ! ! ! " + e.getMessage());
        }finally {
            client.disconnect();
        }
    }
}
