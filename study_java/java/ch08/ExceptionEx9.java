package ch08;

public class ExceptionEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("고의로 발생시켰음");
			throw e; //예외클래스의 객체를 만들어서 throw를 통해 발생시킴
			// throw new Exception("고의로 발생시켰음");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("에러메시지 : " + e.getMessage()); //에러메시지 출력
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음");
	}

}
