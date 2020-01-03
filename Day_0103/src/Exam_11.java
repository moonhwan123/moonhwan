/*
1)
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

2)
A
AB
ABC
ABCD
.
.
.
A ~ Z

3)
     1
    23
   456
 78910
 
4)
********* 9개 9
 *******  7개 9-2
  *****   5개 9-4
   ***    3개 9-6
    *	  1개 9-8

5)
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****
 */







public class Exam_11 {
	public static void main(String[] args) {
		
		//1번)
		System.out.println("1번)");
		int k_1 = 1;
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print(k_1);
				k_1++;
			}
			System.out.println();
		}
		
		//2번)
		
		System.out.println("2번)");
		char ch = 'A';
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= a; b++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
		
		
		
		//3번)
		System.out.println("3번)");
		int k_2 = 1;
		for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 5-a; b++) {
				System.out.print(" ");
			}
			for(int c = 1; c <= a; c++) {
				System.out.print(k_2);
				k_2++;
			}
			System.out.println();
		}
		
		
		//4번)
		System.out.println("4번)");
		
		for (int i = 5; i > 0; i--) {
		    for (int j = 5 - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int k = i * 2 - 1; k > 0; k--) {
		        System.out.print("*");
		    }
		    System.out.println();
		}



		//5번)
		System.out.println("5번)");
		
		
		for (int i = 5; i > 0; i--) {
		    for (int j = 5 - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int k = i ; k > 0; k--) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
}
