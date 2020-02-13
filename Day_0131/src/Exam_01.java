import java.text.SimpleDateFormat;
import java.util.Date;

/*
[날짜 관련 클래스]
Date - 클래스 / Calendar - 인터페이스
GregorianCalender
 */
public class Exam_01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println("년도 : " + now.getYear());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
		String nowStr = sdf.format(now);
		System.out.println(nowStr);
	}
}

