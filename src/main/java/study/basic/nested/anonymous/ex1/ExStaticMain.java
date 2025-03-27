package study.basic.nested.anonymous.ex1;

import java.util.Random;

public class ExStaticMain {
    public static void main(String[] args) {
        //helloDice();
        //helloSum();
        HelloStaticImpl hello = new HelloStaticImpl();
        hello.run(new HelloStaticImpl.Dice());
        HelloIf sum = new HelloStaticImpl.Sum();
        hello.run(sum);
    }
    public static void helloDice(){
        System.out.println("Hello Dice Start");
        int randomVal = new Random().nextInt(6) + 1;
        System.out.println("static 주사위 >>>>>> " + randomVal);
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
