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
		System.out.println(" ���� ���� ���� �� : " + difference1/(24*60*60)+ "��");
		
		long difference2 = (date_cirs.getTimeInMillis() - date_cur.getTimeInMillis())/1000 ;
		System.out.println(" ũ�������� ���� ���� �� : " + difference2/(24*60*60)+ "��");
		

	}

}
