package study.basic.exception.ex3.exception;

public class NetworkSendExceptionV4 extends NetworkClientExceptionV4 {
    private String sendData;
    //private String message;

    public NetworkSendExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }

}
