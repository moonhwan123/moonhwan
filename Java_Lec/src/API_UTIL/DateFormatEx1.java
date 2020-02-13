package API_UTIL;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		System.out.println(today);
		
		SimpleDateFormat sdf1,sdf2,sdf3,sdf4;
		SimpleDateFormat sdf5,sdf6,sdf7,sdf8,sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(today));
		
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		System.out.println(sdf2.format(today));
		
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		System.out.println(sdf3.format(today));
		
		sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS a");
		System.out.println(sdf4.format(today));
		
		sdf5 = new SimpleDateFormat("오늘은 올해의 D번째 날 입니다.");
		sdf6 = new SimpleDateFormat("오늘은 올해의 d번째 날 입니다.");
		sdf7 = new SimpleDateFormat("오늘은 올해의 w번째 주 입니다.");
		sdf8 = new SimpleDateFormat("오늘은 올해의 W번째 주 입니다.");
		sdf9 = new SimpleDateFormat("오늘은 올해의 F번째 E요일 입니다.");
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
	}

}
