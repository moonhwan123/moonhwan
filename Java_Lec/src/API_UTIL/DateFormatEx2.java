package API_UTIL;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(2005, 9,3);
		
		Date day = cal.getTime();
		//Date 인스턴스만 format 메서드 사용가능
		
		SimpleDateFormat sdf1,sdf2,sdf3,sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS a");
		
		System.out.println(sdf1.format(day));
		System.out.println(sdf2.format(day));
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));

	}

}
