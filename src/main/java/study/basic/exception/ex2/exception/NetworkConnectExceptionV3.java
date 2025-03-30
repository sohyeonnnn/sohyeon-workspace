package study.basic.exception.ex2.exception;

public class NetworkConnectExceptionV3 extends NetworkClientExceptionV2 {
    private String address;
    private String message;

    public NetworkConnectExceptionV3(String address, String message) {
        super(address, message);
    }
}
