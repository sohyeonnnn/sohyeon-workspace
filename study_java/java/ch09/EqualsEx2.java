package ch09;

class Person {
	long id;

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return id == ((Person) obj).id; // obj가 id값을 참조하기 위해서는 Person타입으로 형변환
		} else {
			return false; // 타입이 Person이 아니면 값을 비교할 필요없음
		}
	}

	Person(long id) {
		this.id = id;
	}
}

public class EqualsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(8011081111222L);
		Person p2 = new Person(8011081111222L);

		if (p1 == p2) { // 다른 인스턴스이기 때문에 같지 않음
			System.out.println("p1과 p2는 같은 사람입니다");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다");
		}
		if (p1.equals(p2)) { // 다른 인스턴스지만 값은 같음
			System.out.println("p1과 p2는 같은 사람입니다");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다");
		}

	}

}
