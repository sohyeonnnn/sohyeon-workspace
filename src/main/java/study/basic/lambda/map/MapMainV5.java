package study.basic.lambda.map;

import java.util.List;

public class MapMainV5 {

    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange", "kiwi");
        System.out.println(GenericMapper.map(fruits, fruit -> fruit.toUpperCase()));
        System.out.println(GenericMapper.map(fruits, fruit -> fruit.length()));

        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> starList = GenericMapper.map(integers, n -> "*".repeat(n));
        System.out.println(starList);
    }
}
