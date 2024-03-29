package ch11;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		ListIterator it = list.listIterator(); // 양방향 조회 가능

		while (it.hasNext()) {
			System.out.print(it.next()); // 순방향으로 진행
		}
		System.out.println();
		while (it.hasPrevious()) {
			System.out.print(it.previous()); // 역방향으로 진행
		}
		System.out.println();
	}

}
