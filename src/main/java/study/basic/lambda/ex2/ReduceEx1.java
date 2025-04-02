package study.basic.lambda.ex2;

import java.util.List;

public class ReduceEx1 {

    public static int reduce(List<Integer> list, int initial, MyReducer reducer){
        int result = initial;
        for(Integer i : list){
            result = reducer.reduce(result, i);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        int initial = 3;
        int add = reduce(list, initial, (sum,b) -> sum+b);
        int multiply = reduce(list, initial, (sum,b) -> sum*b);
        System.out.println("리스트 : "+list);
        System.out.println("누적합 : "+add);
        System.out.println("누적곱 : "+multiply);
    }
}
