package study.basic.exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String address = "127.0.0.1";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);

        String resultMsg = client.connect();
        if(isError(resultMsg)){
            System.out.println("[log] >>> "+resultMsg);
            return;
        }

        resultMsg = client.send(data);
        if(isError(resultMsg)){
            System.out.println("[log] >>> "+resultMsg);
            return;
        }
        client.disconnect();
    }

    public static boolean isError(String msg){
        return !msg.equals("success");
    }
}
