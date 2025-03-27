package study.basic.nested.anonymous.ex1;

import java.util.Random;

public class HelloStaticImpl {
    public void run(HelloIf helloIf) {
        System.out.println("Hello Start");
        helloIf.start();
        System.out.println("Hello End");
    }
    static class Dice implements HelloIf{
        @Override
        public void start() {
            int randomVal = new Random().nextInt(6) + 1;
            System.out.println("주사위 >>>>>> " + randomVal);
        }
    }

    static class Sum implements HelloIf{
        @Override
        public void start() {
            for(int i = 0; i < 3; i++){
                System.out.println("i : " + i);
            }
        }
    }
}
