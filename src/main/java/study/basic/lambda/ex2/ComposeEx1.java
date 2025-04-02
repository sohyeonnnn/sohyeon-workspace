package study.basic.lambda.ex2;

public class ComposeEx1 {

    public static MyTransformer compose(MyTransformer first, MyTransformer second) {
        return str -> second.transform(first.transform(str));
    }

    public static void main(String[] args) {
        String str = "hello";
        MyTransformer upper = s -> s.toUpperCase();
        MyTransformer deco = s -> "***"+s+"***";

        MyTransformer func = compose(upper, deco);
        System.out.println("result: " + func.transform("hello"));
    }
}
