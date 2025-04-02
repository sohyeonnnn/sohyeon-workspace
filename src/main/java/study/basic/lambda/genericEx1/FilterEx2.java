package study.basic.lambda.genericEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FilterEx2 {

    public static List<String> map (List<String> list, UnaryOperator<String> func){
        List<String> result = new ArrayList<>();
        for(String s : list){
            result.add(func.apply(s));
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> list = List.of("hello", "java", "lambda");
        List<String>  upper = map(list, (s) -> {return s.toUpperCase(); });
        List<String>  deco = map(list, (s) -> {return "***"+s+"***"; });

        System.out.println("원본 : "+list);
        System.out.println("대문자 : "+upper);
        System.out.println("특수문자 : "+deco);

    }
}
