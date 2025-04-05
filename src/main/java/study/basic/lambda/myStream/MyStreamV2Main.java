package study.basic.lambda.myStream;

import java.util.List;

public class MyStreamV2Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7,8 ,9, 10);
        List<Integer> result = MyStreamV2.of(list)
                .filter(e -> e % 2 == 0)
                .map(e -> 2 * e)
                .toList();
        System.out.println(result);

    }
}
