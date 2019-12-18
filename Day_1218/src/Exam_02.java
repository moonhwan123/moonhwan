
public class Exam_02 {

	public static void main(String[] args) {
		
		int a = (int) (7/5.); // 형변환 - '강제 형변환'(데이터가 잘려 나갈 수 있음)
		int b = 7%5; 
		
		System.out.println("7/5 = " + a);
		System.out.println("7%5 = " + b);
		
		System.out.println("7/5 = " + 7/5.);
		System.out.println("7%5 = " + 7%5);
		
		int var = (int) 3.14; // int는 4byte 실수는 8byte라서 x
		double d1 = 3.14;
		double d2 = 90; // 여기서는 '자동 형변환' 이 일어남 double 8byte > 정수 4byte
		System.out.println("d2 = " + d2);
		System.out.println("var = " + var);
		
		
		
	}

}
