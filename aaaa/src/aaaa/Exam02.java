package aaaa;

import java.util.Scanner;

/*
1. 선형 검색 : 첫번째부터 끝까지 쭉 비교하는것
2. 이진 검색 : 데이터가 정렬 되어 있어야함
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
		System.out.print("찾는값 입력 : ");
		int var = sc.nextInt();

		int low = 0;
		int high = score.length - 1;
		int mid = 0;

		while (true) {
			if (low <= high) {
				mid = (low + high) / 2;
			} else {
				System.out.println(var + "은 리스트에 없음");
				break;
			}
			if (var == score[mid]) {
				System.out.println(var + "은 " + (mid + 1) + "번째에 있습니다.");
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
