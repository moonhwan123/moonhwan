import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년월 입력 : ");
		
		String[] day = sc.nextLine().split(",");
		
		int year = Integer.parseInt(day[0]);
		int month = Integer.parseInt(day[1]);
		
		System.out.println("\t\t\t ["+year+"년 "+month+"월]");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//년,월 을 이용한 calender객체 생성
		GregorianCalendar calender = new GregorianCalendar(year,month-1,1);
		
		//해당 월 의 마지막날 구하기
		int maxday = calender.getActualMaximum(calender.DAY_OF_MONTH);
		//요일 구하기
		int week = calender.get(calender.DAY_OF_WEEK);
		
		//시작요일 전 까지 공백 출력
		for(int x = 0; x < (week-1); x++) {
			System.out.print("\t");
		}
		//일자 출력
		for(int x = 1; x <= maxday; x++) {
			if(week <= 7) {
				System.out.print(x + "\t");
			}else {
				System.out.print("\n");
				System.out.print(x + "\t");
				week=1;
			}
			week++;
		}
		System.out.println();
		
		
		
	}
}

