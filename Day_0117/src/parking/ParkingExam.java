package parking;

import java.util.Scanner;

public class ParkingExam {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Parking p1[] = new Parking[100];
	
		int cnt = 0;
		
		while(cnt<100) {
			System.out.print("입력(차량번호,주차시간(분)) : ");
			String carNum = sc.next();
			if(carNum.equals("0000")) break;
			int parkTime = sc.nextInt();
			if(parkTime > 1440) {
				parkTime = 1440;
			}
			p1[cnt] = new Parking(carNum,parkTime);
			cnt++;
		}
		
		ParkingData pd = new ParkingData(p1,cnt);
		
		pd.totalPrint();
		pd.today();

		sc.close();
		
		
		
		
		
		
		
	}
}
