
public class Exam_07 {
	
	public static void main(String[] args) {
		
		// 1)
		System.out.println("1)");
		for(int i = 1; i <= 5; i++) {// 還熱
			for(int j = 1; j <= 5; j++) { // 還渡 蘊熱
			System.out.print("*");	
			}
			System.out.println();
		}
		
		// 2)
		System.out.println("2)");
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) { 
			System.out.print("*");	
			}
			System.out.println();
		}
		
		// 3)
		System.out.println("3)");
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) { 
			System.out.print("*");	
			}
			System.out.println();
		}
		
		// 4)
		System.out.println("4)");
		for(int a = 1; a <= 5; a++) {
			
			for(int i = 1; i<=(5-a); i++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= a; j++) { 
			System.out.print("*");	
			}
			System.out.println();
		}
		
		
		// 5)
		System.out.println("5)");
		for(int a = 1; a <= 5; a++) {
			
			for(int i = 1; i<=(a-1); i++) {
				System.out.print(" ");
			}
			
			for(int j = 5; j >= a; j--) { 
			System.out.print("*");	
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
