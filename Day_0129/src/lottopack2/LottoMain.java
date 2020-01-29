package lottopack2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LottoMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("게임 수 입력 : ");
		int gameCnt = sc.nextInt();
		Lotto[] ltArr = new Lotto[gameCnt]; // Lotto클래스 배열
		Lotto lt;
		int cnt = 0;
		
		//gameCnt만큼 게임을 실행 후 , 랜덤으로 생성된 6자리 수를 클래스 배열에 저장 후 출력
		for(int x = 0; x < gameCnt; x++) {
			int[] lotto = new int[6];
			//번호생성
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				 //중복체크
				for(int y = 0; y < i; y++) {
					if(lotto[i] == lotto[y]) {
						i--;
						break;
					}
				}
			}
			lt = new Lotto(lotto); // 객체에 저장
			 
			ltArr[cnt] = lt; // 객체를 클래스 배열에 저장
			
			cnt++;	
			System.out.println((x+1)+")\t"+lt);
		}
		
		// 정보를 처리할 LottoData클래스 객체 생성
		LottoData ld = new LottoData(ltArr,gameCnt); 
		ld.dangPrint(); // 당첨 번호 출력 메소드
		ld.dangCheck(); // 당첨 확인 후 결과 출력 메소드
		
		

		
	}
}
