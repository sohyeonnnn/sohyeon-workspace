package ch08;

//printStackTrace() ���ܹ߻� ����� ȣ�⽺�ÿ� �־��� �޼����� ������ ���� �޽����� ȭ�鿡 ����Ѵ�
//getMessage() �߻��� ����Ŭ������ �ν��Ͻ��� ����� �޽����� �������ִ�
public class ExceptionEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("���ܸ޽��� : " + ae.getMessage()); // ���� �ν��Ͻ��� ����� �޽���
		}
		System.out.println(6);
	}

}