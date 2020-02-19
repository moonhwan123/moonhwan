package main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class asdasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	    Calendar c1 = Calendar.getInstance();
		String strToday = sdf.format(c1.getTime());
		
		System.out.println(strToday);
		
		String str= "2019-09-15";
		String str2 = str.replace("-", "");
		Scanner sc = new Scanner(System.in);
		
		String outdate = sc.next().replace("-", "");
		
		System.out.println(outdate);
		
		System.out.println(str2);
		

	}

}
