package study.basic.exception.basic.checked;

public class Service {
    Client client = new Client();
    public void callCatch(){
        try{
            client.call();
        } catch (MyCheckedException e){
            System.out.println("예외처리! msg : "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("정상흐름");
    }

    public void callThrow() throws MyCheckedException {
        client.call();
    }

}
