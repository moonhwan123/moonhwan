package API_UTIL;

import java.util.Calendar;

public class CalendarEx2 {

	public static void main(String[] args) {
		
//		set() - ��¥ �� �ð� ����
		
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2019, 10, 22);
		date1.set(2019,Calendar.OCTOBER,10);
		
		System.out.println("date1�� "+toString(date1));
		
		System.out.println("date1�� "+toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"����");
		System.out.println("date2�� "+toString(date2)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"����");
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000 ;
		System.out.println("date1 ���� ���ݱ��� " + difference+ "�ʰ� �������ϴ�.");
		System.out.println("�Ϸ� ����ϸ� , date1 ���� ���ݱ��� " + difference/(24*60*60)+ "���� �������ϴ�.");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"+(date.get(Calendar.MONTH)+1)+"��"+date.get(Calendar.DATE)+"�� ";
	}
}
