package study.basic.nested.anonymous.ex1;

import java.util.Random;

public class ExLocalMain {
    public static void main(String[] args) {
        class Dice implements HelloIf{
            @Override
            public void start() {
                int randomVal = new Random().nextInt(6) + 1;
                System.out.println("local 주사위 >>>>>> " + randomVal);
            }
        }

        class Sum implements HelloIf{
            @Override
            public void start() {
                for(int i = 0; i < 3; i++){
                    System.out.println("i : " + i);
                }
            }
        }

        //helloDice();
        //helloSum();
        HelloStaticImpl hello = new HelloStaticImpl();
        hello.run(new Dice());
        hello.run(new Sum());
    }
    public static void helloDice(){
        System.out.println("Hello Dice Start");
        int randomVal = new Random().nextInt(6) + 1;
        System.out.println("주사위 >>>>>> " + randomVal);
        System.out.println("Hello Dice End");
    }

    public static void helloSum(){
        System.out.println("Hello Sum Start");
        for(int i = 0; i < 3; i++){
            System.out.println("i : " + i);
        }
        System.out.println("Hello Sum End");
    }
}
