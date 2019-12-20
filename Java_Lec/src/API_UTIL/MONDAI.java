package API_UTIL;

import java.util.Calendar;

public class MONDAI {

	public static void main(String[] args) {
		
		
		Calendar date_cur = Calendar.getInstance();
		Calendar date_mal = Calendar.getInstance();
		Calendar date_cirs = Calendar.getInstance();
		
		date_mal.set(2019,11,31);
		date_cirs.set(2019,11,25);
		
		
		long difference1 = (date_mal.getTimeInMillis() - date_cur.getTimeInMillis())/1000 ;
		System.out.println(" 연말 까지 남은 날 : " + difference1/(24*60*60)+ "일");
		
		long difference2 = (date_cirs.getTimeInMillis() - date_cur.getTimeInMillis())/1000 ;
		System.out.println(" 크리스마스 까지 남은 날 : " + difference2/(24*60*60)+ "일");
		

	}

}
