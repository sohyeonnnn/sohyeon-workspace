package ch08;

public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4);
		} catch (Exception e) { 
			// TODO: handle exception
			System.out.println(5); //에러가 발생하지 않았기 때문에 실행x
		}
		System.out.println(6);
	}

}
