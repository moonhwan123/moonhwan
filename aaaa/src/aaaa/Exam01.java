package aaaa;

import java.util.Scanner;

/*
1. ���� �˻� : ù��°���� ������ �� ���ϴ°�
2. ���� �˻� : 
 */


public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = false;
		
		int[] score = {90,49,75,67,55,34,55,15,64,89};
		
		System.out.println("Data Print");	
		for(int x = 0; x < score.length; x++) {
			System.out.print(score[x]+"\t");
		}
		System.out.println();
		System.out.print("ã�°� �Է� : ");
		int var = sc.nextInt();
		
		for(int x = 0; x < score.length; x++) {
			if(var == score[x]) {
				System.out.println(var+"�� "+ x +"��°���Դϴ�.");
				sw = true;
				continue;
			}
		}
		if(!sw) {
			System.out.println("���� ��");
		}
		
	}
}
