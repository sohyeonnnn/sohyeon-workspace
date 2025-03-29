package study.basic.exception.ex2;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws NetworkConnectExceptionV3 {
        if (connectError) {
            throw new NetworkConnectExceptionV3(address, address+" 서버 연결 실패!");
        }
        //연결성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws NetworkSendExceptionV3 {
        if (sendError) {
            throw new NetworkSendExceptionV3("sendError", address+" 전송 실패!");
            //throw new RuntimeException("예상치 못한 예외 발생 ! ! ! ");
        }
        //전송성공
        System.out.println(address +" 서버에 데이터 전송 성공 : "+data );
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }else if(data.contains("error2")){
            sendError = true;
        }
    }
}
