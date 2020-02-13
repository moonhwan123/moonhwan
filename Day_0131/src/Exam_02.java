import java.util.Calendar;

/*
Calender
월은 0-11
요일 (1~7) 1 : 일요일
YEAR,MONTH,DATE 년,월,일
HOUR,MINUTE,SECNOD 시,분,초 , AM_PM
DAY_OF_WEEK 

 */
public class Exam_02 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //new 사용 불가
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //0~11월
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year+"-"+month+"-"+day);
		
	}
}
