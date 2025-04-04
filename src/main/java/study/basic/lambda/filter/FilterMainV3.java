package study.basic.lambda.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV3 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수만 거르기
        List<Integer> evenNumbers = IntegerFilter.filter(numbers,val -> val % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers);

        // 홀수만 거르기
        List<Integer> oddNumbers = IntegerFilter.filter(numbers, val -> val % 2 != 0);
        System.out.println("oddNumbers = " + oddNumbers);
    }


}
