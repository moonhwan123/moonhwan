package API_UTIL;

import java.util.Calendar;

// add(int field, int amount) : 지정한 필드의 값을 원하는 만큼 증감
// roll(int field, int amount) : 지정한 필드의 값을 원하는 만큼 증감 (다른 필드에 영향을 미치지 않는다.)


public class CalendarEx4 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		
		date.set(2005, 7,31);
		System.out.println(toString(date));
		
		System.out.println("==1일후==");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("==6달전==");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("==31일 후==");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("==31일 후==");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일 ";
	}
	
}
