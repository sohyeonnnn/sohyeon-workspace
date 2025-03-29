package study.basic.exception.basic.checked;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();

        try {
            service.callThrow();}
        catch (MyCheckedException e) {
            System.out.println("main에서 해결!");
        }
        System.out.println("main ~~");

    }
}
