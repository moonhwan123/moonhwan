package API_UTIL;

import java.util.Calendar;

/*
[Calendar / Date]

	date : 
		��¥�� �ð��� �ٷ� �������� ������� Ŭ����(jdk 1.0)
		���� ������ ũ���������� ������ ���
		   
	calendar : 
		Date Ŭ������ ������ Ŭ����(jdk 1.1)
		�߻� Ŭ����(getInstance�� ���� ������ ��üȹ��)
		
	Time Ŭ���� : 
		Date/Calendar ������ ������ Ŭ����(jdk 1.8)
	
	Calendar�� Date�� ������ ���� ������ �ʿ��� ��찡 ���� ����
	
	(Date -> Calendar)
	Calendar cal = Calendar.getInstance();
	Date d = new Date(cal.getTimeINMilleis());

	(Calendar -> Date)
	Date d = new Date();
	Calendar cal = Calendar.getInstance
	car.setTime(d);
 */



public class calenderEx1 {

	public static void main(String[] args) {
		
//		Calendar cal = new Calendar(); -> ���� (�߻�Ŭ���� �̹Ƿ�)
		
//		get() - Calendar�� ���ǵ� static���
		
		Calendar today = Calendar.getInstance(); // ���� ��¥�� �ð����� ����
		
		System.out.println("�� ���� �⵵ : "+today.get(Calendar.YEAR));
		System.out.println("��(0~11) : "+today.get(Calendar.MONTH));
		
		System.out.println("�� ���� ���� : "+ today.get(Calendar.DATE));
		System.out.println("�� ���� ���� : "+ today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("�� ���� �� ° ��  : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° ��  : "+today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("����(1~7 , 1 -> �Ͽ���) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�� ���� �� ° ���� : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("���� ���� (0:���� , 1:����) : "+today.get(Calendar.AM_PM));
		
		System.out.println("�ð� ( 0 ~ 11 ) : "+today.get(Calendar.HOUR));
		System.out.println("�ð� ( 0 ~ 24 ) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� ( 0 ~ 59 ) : "+today.get(Calendar.MINUTE));
		System.out.println("�� ( 0 ~ 59 ) : "+today.get(Calendar.SECOND));
		System.out.println("1/1000 �� ( 0 ~ 5999 ) : "+today.get(Calendar.MILLISECOND));
		
		System.out.println("�� ���� �������� : "+today.getActualMaximum(Calendar.DATE));
		
		
		
		
	}

}
