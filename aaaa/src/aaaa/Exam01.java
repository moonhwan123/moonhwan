package aaaa;

import java.util.Scanner;

/*
1. 선형 검색 : 첫번째부터 끝까지 쭉 비교하는것
2. 이진 검색 : 
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
		System.out.print("찾는값 입력 : ");
		int var = sc.nextInt();
		
		for(int x = 0; x < score.length; x++) {
			if(var == score[x]) {
				System.out.println(var+"는 "+ x +"번째값입니다.");
				sw = true;
				continue;
			}
		}
		if(!sw) {
			System.out.println("없는 값");
		}
		
	}
}
