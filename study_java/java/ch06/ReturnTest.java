package ch06;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest r = new ReturnTest(); // 객체 생성

		int result = r.add(3, 5); // 8
		System.out.println(result);

		int[] result2 = { 0 }; // 배열을 생성하고 result2[0]의 값을 0으로 초기화
		r.add(3, 5, result2); // 배열을 add메서드의 매개변수로 전달
		System.out.println(result2[0]); // 8
	}

	int add(int a, int b) {
		return a + b;

	}

	void add(int a, int b, int[] result) {
		result[0] = a + b; // 매개변수로 넘겨받은 배열에 연산결과를 저장
		//이것을 응용하면 여러 개의 값을 반환받는 것고 같은 효과를 낼수 있다
	}

}
