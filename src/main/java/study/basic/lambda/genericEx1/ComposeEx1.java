package study.basic.lambda.genericEx1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ComposeEx1 {

    public static Function<String, String> compose(Function<String, String> first, Function<String, String> second) {
        return str -> second.apply(first.apply(str));
    }

    public static void main(String[] args) {
        String str = "hello";
        Function<String, String> upper = s -> s.toUpperCase();
        Function<String, String> deco = s -> "***"+s+"***";

        Function<String, String> func = compose(upper, deco);
        System.out.println("result: " + func.apply("hello"));

    }
}
