package study.basic.exception.ex3.exception;

public class NetworkConnectExceptionV4 extends NetworkClientExceptionV4 {
    private String address;
    private String message;

    public NetworkConnectExceptionV4(String address, String message) {
        super(message);
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
