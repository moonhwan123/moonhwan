
public class Exam_07 {
	public static void main(String[] args) {
		
		String date = "20200131"; 
		
		//2020-01-31
		//2020³â01¿ù31ÀÏ
		
		String y = date.substring(0,4);
		String m = date.substring(4,6);
		String d = date.substring(6);
		
		String str = y+"-"+m+"-"+d;
		System.out.println(str);
		
		
		
	}
}
