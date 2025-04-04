package study.basic.lambda.filter;

import java.util.List;

public class FilterMainV4 {

    public static void main(String[] args) {
        // 숫자 필터
        List<Integer> numbers = List.of(13, 5, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numberResult = GenericFilter.filter(numbers,val -> val % 2 == 0);
        System.out.println("numberResult = " + numberResult);

        // 문자 필터
        List<String > strings = List.of("aa","eb","crr","e","A","y","Z");
        List<String> StrinResult = GenericFilter.filter(strings,val -> val.length()>=2);
        System.out.println("StrinResult = " + StrinResult);
    }


}
