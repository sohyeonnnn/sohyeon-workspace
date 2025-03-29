package study.basic.exception.basic.unchecked;

public class Main {
    public static void main(String[] args) {
        MyUncheckedService service = new MyUncheckedService();
        service.callCatch();
        service.callThrow();
        System.out.println("정상종료");
    }
}
