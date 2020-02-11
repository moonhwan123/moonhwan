package sawon2;

import java.util.Scanner;

public class SawonExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Sawon[] sa = new Sawon[10];
		
		int cnt = 0;
		
		while(cnt < 10) {
			System.out.print("사원 정보 : ");
			String buseo = sc.next();
			if(buseo.equals("end")) break;
			int sabun = sc.nextInt();
			String name = sc.next();
			int pay = sc.nextInt();
			
			sa[cnt] = new Sawon(buseo, sabun, name, pay);
			
			cnt++;
			
		}
		
		SawonData sd = new SawonData(sa, cnt);
		
		sd.totalPrint();
		
		
		
	}
}
