package study.basic.lambda.myStream;

import java.util.List;

public class MyStreamLoopMain {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("banana",100),
                new Student("kiwi", 80),
                new Student ("apple",90),
                new Student("lemon",65),
                new Student("orange",30),
                new Student("blueberry", 100));

        List<String> result1 = MyStreamV3.of(students)
                .filter(s-> s.getScore()>=80)
                .map(s -> s.getName())
                .toList();

        //외부출력
        for(String result : result1){
            System.out.println("result1 > name: "+result);
        }

       MyStreamV3.of(students)
                .filter(s-> s.getScore()>=80)
                .map(s -> s.getName())
                .forEach(s-> System.out.println("retult2 >> name : "+s));


    }

}
