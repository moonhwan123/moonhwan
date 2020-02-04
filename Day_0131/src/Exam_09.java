import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 1.���ڿ��� ��¥������ ��ȯ
 SimpleDateFormat -> parse(str);
 
 2.��¥���� ���ڿ��� ��ȯ
 
 
 */
public class Exam_09 {
	public static void main(String[] args) {
		
		String today = "20200131";
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date now = sdf1.parse(today);
			String now1 = sdf2.format(now);
			System.out.println(now1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
}