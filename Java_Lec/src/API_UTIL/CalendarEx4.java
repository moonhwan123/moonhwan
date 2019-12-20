package API_UTIL;

import java.util.Calendar;

// add(int field, int amount) : ������ �ʵ��� ���� ���ϴ� ��ŭ ����
// roll(int field, int amount) : ������ �ʵ��� ���� ���ϴ� ��ŭ ���� (�ٸ� �ʵ忡 ������ ��ġ�� �ʴ´�.)


public class CalendarEx4 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		
		date.set(2005, 7,31);
		System.out.println(toString(date));
		
		System.out.println("==1����==");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("==6����==");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("==31�� ��==");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("==31�� ��==");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"+(date.get(Calendar.MONTH)+1)+"��"+date.get(Calendar.DATE)+"�� ";
	}
	
}
