package aaaa;

import java.util.Scanner;

/*
1. ���� �˻� : ù��°���� ������ �� ���ϴ°�
2. ���� �˻� : �����Ͱ� ���� �Ǿ� �־����
 */

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = false;

		int[] score = { 11, 23, 34, 56, 67, 75, 76, 82, 83, 94 };

		System.out.println("Data Print");
		for (int x = 0; x < score.length; x++) {
			System.out.print(score[x] + "\t");
		}
		System.out.println();
		System.out.print("ã�°� �Է� : ");
		int var = sc.nextInt();

		int low = 0;
		int high = score.length - 1;
		int mid = 0;

		while (true) {
			if (low <= high) {
				mid = (low + high) / 2;
			} else {
				System.out.println(var + "�� ����Ʈ�� ����");
				break;
			}
			if (var == score[mid]) {
				System.out.println(var + "�� " + (mid + 1) + "��°�� �ֽ��ϴ�.");
				break;
			}
			if (var < score[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		

	}
}
