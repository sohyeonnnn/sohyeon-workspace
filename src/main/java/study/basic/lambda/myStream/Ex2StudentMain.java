package study.basic.lambda.myStream;

import study.basic.lambda.filter.GenericFilter;
import study.basic.lambda.map.GenericMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Ex2StudentMain {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("lim",100),
                new Student("kim", 80),
                new Student ("lee",90),
                new Student("han",85),
                new Student("jung",30),
                new Student("park", 60));
        System.out.println(direct(students, 80));

        System.out.println(lambda(students, 80));
    }
    public static List<String> direct(List<Student> students, int score){
        List<String> results = new ArrayList<>();
        for(Student student : students){
            if(student.getScore() >= score){
                results.add(student.getName());
            }
        }
        return results;
    }

    public static List<String> lambda (List<Student> students, int score){
        List<Student> studentsList = GenericFilter.filter(students, student -> student.getScore() >= score);
        return GenericMapper.map(studentsList, student -> student.getName());
    }

}
