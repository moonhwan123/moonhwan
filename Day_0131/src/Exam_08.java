import java.text.SimpleDateFormat;
import java.util.Date;

/*
[SimpleDateFormat]

 */
public class Exam_08 {
	public static void main(String[] args) {
		Date today = new Date(); 
		System.out.println("���� ��¥ : "+today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now1 = sdf.format(today);
		
		System.out.println("��¥ ��ȯ : " + now1);
		
		
		
		
	}
}
