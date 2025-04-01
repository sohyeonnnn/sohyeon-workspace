package study.basic.lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterEx1 {

    public static List<Integer> filter(List<Integer> list, MyPredicate predicate){
        List<Integer> result = new ArrayList<>();
        for (int val : list){
            if(predicate.test(val)){
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, -2, 3, 5, -10, 7);

        List<Integer> negatives = filter(list, val-> { return val < 0 ;});
        List<Integer> evens = filter(list, val-> { return val %2 == 0 ;});

        System.out.println("원본 : " + list);
        System.out.println("음수만 : " + negatives);
        System.out.println("짝수만 : " + evens);
    }
}
