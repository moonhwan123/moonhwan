package API_UTIL;
// ����������/���õ��������� �̿��ؼ� 

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MONDAI2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Date today = new Date();
		
		System.out.println("��¥�� yyyy/MM/dd�� ���·� �Է� ���ּ���.(�Է� �� : 2015/12/31)");
		
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
