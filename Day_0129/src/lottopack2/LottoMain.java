package lottopack2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �� �Է� : ");
		int gameCnt = sc.nextInt();
		Lotto[] ltArr = new Lotto[gameCnt]; // LottoŬ���� �迭
		Lotto lt;
		int cnt = 0;
		
		//gameCnt��ŭ ������ ���� �� , �������� ������ 6�ڸ� ���� Ŭ���� �迭�� ���� �� ���
		for(int x = 0; x < gameCnt; x++) {
			int[] lotto = new int[6];
			//��ȣ����
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				 //�ߺ�üũ
				for(int y = 0; y < i; y++) {
					if(lotto[i] == lotto[y]) {
						i--;
						break;
					}
				}
			}
			lt = new Lotto(lotto); // ��ü�� ����
			 
			ltArr[cnt] = lt; // ��ü�� Ŭ���� �迭�� ����
			
			cnt++;	
			System.out.println((x+1)+")\t"+lt);
		}
		
		// ������ ó���� LottoDataŬ���� ��ü ����
		LottoData ld = new LottoData(ltArr,gameCnt); 
		ld.dangPrint(); // ��÷ ��ȣ ��� �޼ҵ�
		ld.dangCheck(); // ��÷ Ȯ�� �� ��� ��� �޼ҵ�
		
		

		
	}
}
