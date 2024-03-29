package ch09;

import java.util.Random;

public class RandomEx2 {

	// 0~9 사이의 난수를 100개 발생시키고 각 숫자의 빈도수를 센 다음 그래프를 그리는 예제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] number = new int[100];
		int[] counter = new int[10];

		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = rand.nextInt(10)); // 0~10사이의 랜덤숫자 100개 발생
		}
		System.out.println();

		for (int i = 0; i < number.length; i++) {
			counter[number[i]]++; // 각 숫자의 빈도수 count
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.println(i + "의 개수 : " + printGraph('#', counter[i]) + "" + counter[i]);
		}
	}

	public static String printGraph(char ch, int value) {
		char[] bar = new char[value];

		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch; // 숫자의 개수만큼 문자 출력
		}
		return new String(bar);
	}

}
