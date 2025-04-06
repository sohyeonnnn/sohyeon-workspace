package study.basic.lambda.myStream;

import java.util.List;

public class MyStreamV3Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("banana",100),
                new Student("kiwi", 80),
                new Student ("apple",90),
                new Student("lemon",85),
                new Student("orange",30),
                new Student("blueberry", 100));

        List<String> result1 = ex1(students);
        System.out.println("result1 : "+result1);

        List<String> result2 = ex2(students);
        System.out.println("result2 : "+result2);

    }

    public static List<String> ex1(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s-> s.getScore()>=80)
                .map(s -> s.getName())
                .toList();
    }

    public static List<String> ex2(List<Student> students) {
        return MyStreamV3.of(students)
                .filter(s-> s.getScore()>=80)
                .filter(s-> (s.getName().length())==5)
                .map(s->s.getName())
                .map(name->name.toUpperCase())
                .toList();
    }

}
