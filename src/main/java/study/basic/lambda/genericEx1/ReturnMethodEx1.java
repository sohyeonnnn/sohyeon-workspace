package study.basic.lambda.genericEx1;

import java.util.function.Function;

public class ReturnMethodEx1 {

    public static Function<String, String> buildGreeter(String greeting){
        return str -> { return greeting + ", " + str;};
    }

    public static void main(String[] args) {

        Function<String, String> HelloGreeter = buildGreeter("Hello");
        Function<String, String> HiGreeter = buildGreeter("Hi");

        System.out.println(HelloGreeter.apply("sohyeon"));
        System.out.println(HelloGreeter.apply("java"));
        System.out.println(HiGreeter.apply("java"));
        System.out.println(HiGreeter.apply("spring"));

    }
}
