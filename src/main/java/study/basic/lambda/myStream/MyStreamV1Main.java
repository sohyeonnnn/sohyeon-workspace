package study.basic.lambda.myStream;

import java.util.List;

public class MyStreamV1Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7,8 ,9, 10);
        returnList(list);
    }

    public static void returnList(List<Integer> list){
        MyStreamV1 myStream = new MyStreamV1(list);
        myStream = myStream.filter(e -> e % 2 == 0)
                .map(e -> 2 * e);
        System.out.println(myStream.toList());
    }
}
