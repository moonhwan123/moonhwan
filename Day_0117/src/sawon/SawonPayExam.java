package sawon;

import java.util.Scanner;

public class SawonPayExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sawon[] bu = new Sawon[10];
		int cnt = 0;
		while(cnt<10) {
			System.out.print("사원 정보[ID / 등급(1~3) / 근무시간(최대 50시간 까지만 인정 됩니다.)] >> ");
			String id = sc.next();
			if(id.equals("end")) break;
			int grade = sc.nextInt();
			int time = sc.nextInt();
			if(time > 50) {
				time = 50;
			}
			
			bu[cnt] = new Sawon(id,grade,time);
			cnt++;
			
		}
		
		SawonPay sp = new SawonPay(bu, cnt);
		
		sp.totalPrint();
		sp.topPrint();
		
	}
}
