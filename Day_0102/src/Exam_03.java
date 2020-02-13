import java.util.Scanner;

/*
주차요금 계산 프로그램 작성
키보드로 차량번호, 주차시간(분) 을 입력

예) 
	차량번호 : 1234
	주차시간 : 42
	
	주차요금 계산 
	차량번호	요금
	1234	1500원
	
주차가능 시간은 최대 하루(24시간)
주차요금은 10분미만은 무료, 30분까지 500원,
30분이후 부터는 10분당 500원 계산
하루주차요금은 최대 30,000원으로 계산하며, 30,000원을 초과 하더라도 30,000원을 징수


 */



public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("차량 번호 : ");
		int car_num = sc.nextInt();
		System.out.print("주차 시간(분) : ");
		int parking_time = sc.nextInt();
		
		int parking_fee = 0;
		
		
		if(parking_time<10) {
			parking_fee = 0;
		}
		else if(parking_time < 30) {
			parking_fee = 500;
		}
		else{
			parking_fee = 500 + ((parking_time-21)/10 * 500);
			if(parking_fee > 30000) parking_fee = 30000;
		}
		
		System.out.println("차량번호\t요금");
		System.out.println(car_num+"\t"+parking_fee+"원");
		
		
		
		
	}

}
