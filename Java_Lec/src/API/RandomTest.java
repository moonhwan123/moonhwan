package API;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		//[Random Class]
		//���� ������ ��ǥ
		
		/*
		
		Random() : ������ �ð��� ���� ������ �ν��Ͻ� ����
		Random(long seed) : seed�� ���� ������ �ϴ� �ν��Ͻ� ����
		
		int nextInt() : ������ int�� ��ȯ
		int nextInt(int n) : 0���� ũ�� n���� ���� int�� ��ȯ
		boolean nextBoolean : �������� boolean����ȯ
		long nextLong() : �������� long�� ��ȯ
		double nextDouble() : �������� double�� ��ȯ
		
		 */
		
		Random random = new Random();
		Random random1 = new Random(2);
		Random random2 = new Random(2);
		
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("�⺻ ������ : "+random.nextInt());
		}
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("���� ���� : "+random.nextInt(45));
		}
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("random1 : "+random1.nextInt(45));
		}
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("random2 : "+random2.nextInt(45));
		}

	}

}
