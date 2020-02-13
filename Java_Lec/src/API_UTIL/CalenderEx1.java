package API_UTIL;

import java.util.Calendar;

/*
[Calendar / Date]

	date : 
		날짜와 시간을 다룰 목적으로 만들어진 클래스(jdk 1.0)
		예전 버전의 크래스이지만 여전히 사용
		   
	calendar : 
		Date 클래스를 개선한 클래스(jdk 1.1)
		추상 클래스(getInstance를 통해 구현된 객체획득)
		
	Time 클래스 : 
		Date/Calendar 단점을 개선한 클래스(jdk 1.8)
	
	Calendar가 Date의 단점을 보완 했지만 필요한 경우가 종종 있음
	
	(Date -> Calendar)
	Calendar cal = Calendar.getInstance();
	Date d = new Date(cal.getTimeINMilleis());

	(Calendar -> Date)
	Date d = new Date();
	Calendar cal = Calendar.getInstance
	car.setTime(d);
 */



public class CalenderEx1 {

	public static void main(String[] args) {
		
//		Calendar cal = new Calendar(); -> 오류 (추상클래스 이므로)
		
//		get() - Calendar에 정의된 static상수
		
		Calendar today = Calendar.getInstance(); // 현재 날짜와 시간으로 설정
		
		System.out.println("이 해의 년도 : "+today.get(Calendar.YEAR));
		System.out.println("월(0~11) : "+today.get(Calendar.MONTH));
		
		System.out.println("이 달의 몇일 : "+ today.get(Calendar.DATE));
		System.out.println("이 달의 몇일 : "+ today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("이 해의 몇 째 주  : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주  : "+today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("요일(1~7 , 1 -> 일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전 오후 (0:오전 , 1:오후) : "+today.get(Calendar.AM_PM));
		
		System.out.println("시간 ( 0 ~ 11 ) : "+today.get(Calendar.HOUR));
		System.out.println("시간 ( 0 ~ 24 ) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 ( 0 ~ 59 ) : "+today.get(Calendar.MINUTE));
		System.out.println("초 ( 0 ~ 59 ) : "+today.get(Calendar.SECOND));
		System.out.println("1/1000 초 ( 0 ~ 5999 ) : "+today.get(Calendar.MILLISECOND));
		
		System.out.println("이 달의 마지막날 : "+today.getActualMaximum(Calendar.DATE));
		
		
		
		
	}

}
