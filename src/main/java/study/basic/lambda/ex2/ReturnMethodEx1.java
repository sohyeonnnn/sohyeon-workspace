package study.basic.lambda.ex2;

public class ReturnMethodEx1 {

    public static StringFunction buildGreeter(String greeting){
        return str -> { return greeting + ", " + str;};
    }

    public static void main(String[] args) {

        StringFunction HelloGreeter = buildGreeter("Hello");
        StringFunction HiGreeter = buildGreeter("Hi");

        System.out.println(HelloGreeter.apply("sohyeon"));
        System.out.println(HelloGreeter.apply("java"));
        System.out.println(HiGreeter.apply("java"));
        System.out.println(HiGreeter.apply("spring"));

    }
}
