/*
[equals() / equalsIgnoreCase() - 대소문자 관계없이 판단 할 것인가]




 */



public class Exam_04 {
	public static void main(String[] args) {
		
		
		String s = "end";
		
		if(s.equals("END")) {
			System.out.println("==");
		}else {
			System.out.println("xx");
		}
		System.out.println("------------------");
		
		if(s.equalsIgnoreCase("END")) {
			System.out.println("==");
		}else {
			System.out.println("xx");
		}
		
		
		
		
		
	}
}

