package ch14;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] stuArr = { new Student("이자바", 3, 300), new Student("김자바", 1, 200), new Student("안자바", 2, 100),
				new Student("박자바", 2, 150), new Student("소자바", 1, 200), new Student("나자바", 3, 290),
				new Student("감자바", 3, 180) };

		Stream<Student> stuStream = Stream.of(stuArr);

		stuStream.sorted(Comparator.comparing(Student::getBan) // 반으로 정렬
				.thenComparing(Comparator.naturalOrder())) // 점수 내림차순
				.forEach(System.out::println); // 출력

		stuStream = Stream.of(stuArr);
		IntStream stuScoreStream = stuStream.mapToInt(Student::getTotalScore); // 점수 스트림

		IntSummaryStatistics stat = stuScoreStream.summaryStatistics();
		System.out.println("count=" + stat.getCount());
		System.out.println("sum=" + stat.getSum());
		System.out.printf("average=%.2f%n", stat.getAverage());
		System.out.println("min=" + stat.getMin());
		System.out.println("max=" + stat.getMax());

	}

}
