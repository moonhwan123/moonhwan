import java.util.Arrays;
import java.util.Scanner;

/*
번호, 이름 , 점수n개를 입력 받아서 출력 하는 프로그램을 완성하시오
1) 입력항목 - 최대 10개 또는 번호가 -99이면 출력 후 종료
	-번호, 이름, 점수 5개
2) 처리조건
	-점수 출력 시 오름차순으로 출력
3) 출력
	번호  이름   점수
	1    홍길동  77 80 98 70 50
 */

class Hak{
	int bun;
	String name;
	int[] score;
	
	Hak(){}
	Hak(int bun, String name, int[] score){
		this.bun = bun;
		this.name = name;
		this.score = score.clone();
		Arrays.sort(this.score);
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(bun+"\t");
		sb.append(name+"\t");
		for(int x = 0; x < score.length; x++) {
			sb.append(score[x]+"  ");
		}
		return sb.toString();
	}

}

class HakData{
	Hak[] hak;
	int cnt;
	
	HakData(Hak[] hak,int cnt){
		this.hak = hak;
		this.cnt = cnt;
	}
	
	void dataPrint() {
		System.out.println("번호\t이름\t점수");
		for(int x = 0 ; x < cnt ; x++) {
			System.out.println(hak[x]);
		}
	}
	
}


public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int cnt= 0;
		Hak hak;
		Hak[] hakArr = new Hak[10];
		int[] score = new int[5];
		
		while(cnt<10) {
			System.out.print("번호,이름,점수 5개 입력 하세요 >> ");
			String str = sc.nextLine();
			String[] strArr = str.split(",");
			
			if(strArr[0].equals("-99")) {
				break;
			}
			
			for(int x = 0; x < score.length; x++) {
				score[x] = Integer.parseInt(strArr[x+2]);
			}
			
			hak = new Hak(Integer.parseInt(strArr[0]),strArr[1],score);
			hakArr[cnt] = hak;
			cnt++;
		}
		
		HakData hd = new HakData(hakArr,cnt);
		hd.dataPrint();
		
	}
}
