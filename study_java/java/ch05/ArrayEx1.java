package ch05;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5]; // ũ�Ⱑ 5�� ������ �迭 ����, ����
		int k = 1;

		// �迭�� ����
		score[0] = 50;
		score[1] = 60;
		score[k + 1] = 70;
		score[3] = 80;
		score[4] = 90;

		int tmp = score[k + 2] + score[4]; // 170

		for (int i = 0; i < 5; i++) {
			System.out.printf("score[%d]:%d%n", i, score[i]);
		}

		System.out.printf("tmp:%d%n", tmp);
		// �迭�� �ε����� ��ȿ�� ������ �Ѿ ���� �߻���
		System.out.printf("score[%d]:%d%n", 7, score[7]);

	}

}