package study.basic.nested.anonymous.ex1;

import java.util.Random;

public class ExLambdaMain {
    public static void main(String[] args) {

        HelloStaticImpl hello = new HelloStaticImpl();
        hello.run(new HelloIf(){
            @Override
            public void start() {
                int randomVal = new Random().nextInt(6) + 1;
                System.out.println("anonymous 주사위 >>>>>> " + randomVal);
            }
        });

        hello.run(new HelloIf(){
            @Override
            public void start() {
                for(int i = 0; i < 3; i++){
                    System.out.println("i :::: " + i);
                }
            }
        });

        //람다
        hello.run(() -> {
            for(int i = 0; i < 3; i++){
                System.out.println("lambda i :::: " + i);
            }
        });
    }
}
