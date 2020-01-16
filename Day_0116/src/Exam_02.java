import java.util.Scanner;

/*
키보드로 사원번호 ,이름 , 급여 입력(최대10명)
사원 번호가 -99 일때 종료

입력 : 사번   이름   급여
.	.	.

[출력]
사번  이름  급여  50,000  10,000  5,000  1,000  . . . . .
.	.	.	.	.	.	.

합계 	    xx    xx     xx      xx 

사원(Sawon), 사원처리(SawonData)


 */


public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		Sawon sa[] = new Sawon[10];
		Sawon s;
		while(cnt<10) {
			System.out.print("입력 : ");
			int sabun = sc.nextInt();
			if(sabun == -99) break;
			String name = sc.next();
			int pay = sc.nextInt();
			s = new Sawon(sabun,name,pay);
			s.payAccount();
			sa[cnt] = s;
			cnt++;
		}
		
		SawonData sd = new SawonData();
		
		sd.addPay(sa, cnt);
		sd.addMoney(sa, cnt);
		sd.saPrint(sa, cnt);

		
		
		
		
	}
}
