import java.text.DecimalFormat;

/*
[숫자 형식화]
DecimalFormat
 */
public class Exam_06 {
	public static void main(String[] args) {
		int money = 751238600;
		double money2 = 458200.7777;
		
		//￦
		DecimalFormat df1 = new DecimalFormat("￦#,###");
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		
		String str1 = df1.format(money);
		String str2 = df2.format(money2);
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		
	}
}
