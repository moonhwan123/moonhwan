package API_UTIL;
// 데이터포멧/심플데이터포멧 이용해서 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MONDAI2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Date today = new Date();
		
		System.out.println("날짜를 yyyy/MM/dd의 형태로 입력 해주세요.(입력 예 : 2015/12/31)");
		
		SimpleDateFormat inputDate;
		inputDate = new SimpleDateFormat("yyyy/MM/dd");
		
		String INPUT_DATE = sc.nextLine();
	
		try {
			Date d1 = inputDate.parse(INPUT_DATE);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
