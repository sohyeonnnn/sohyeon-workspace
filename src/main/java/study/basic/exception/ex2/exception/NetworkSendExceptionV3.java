package study.basic.exception.ex2.exception;

public class NetworkSendExceptionV3 extends NetworkClientExceptionV2 {
    private String errorCode;
    //private String message;

    public NetworkSendExceptionV3(String errorCode, String message) {
        super(errorCode, message);
    }

}
