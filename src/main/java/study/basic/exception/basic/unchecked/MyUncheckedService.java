package study.basic.exception.basic.unchecked;

public class MyUncheckedService {
    Client client = new Client();

    public void callCatch(){
        try{
            client.call();
        }
        catch (MyUncheckedException e){
            System.out.println("예외처리! msg : "+e.getMessage());
        }
        System.out.println("정상main");
    }

    public void callThrow(){
        System.out.println("call throw");
        client.call();
    }
}
