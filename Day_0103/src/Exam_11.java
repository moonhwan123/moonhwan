import java.util.Scanner;

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
********* 9�� 9
 *******  7�� 9-2
  *****   5�� 9-4
   ***    3�� 9-6
    *	  1�� 9-8

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
		
		//1��)
		System.out.println("1��)");
		int number = 1;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(number);
				System.out.print("\t");
				number++;
			}
			System.out.println();
		}
		
		//2��)
		
		System.out.println("2��)");
		for(int i = 1; i <= 26; i++) {
			char ch = 'A';
			for(int j = 1; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
		
		
		
		//3��)
		System.out.println("3��)");
		int number1 = 1;
		for(int i = 1; i <= 5; i++) {
			for(int k = 5-i; k >= 1; k--) {
				System.out.print("\t");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(number1);
				System.out.print("\t");
				number1++;
			}
			System.out.println();
		}
		
		
		//4��)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݺ��� Ƚ�� �Է�>>");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (num*2+1)-(i*2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}



		//5��)
		System.out.println("5��)");
		for(int i = 1; i <= 9; i++) {
			if(i<=5) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print(" ");
				}
				for(int k = 5; k >= i; k--) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int a = 8; a >= i; a--) {
					System.out.print(" ");
				}
				for(int b = 6; b <= i+1; b++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		
		
		
		
		
		
		
		
		
	}
}
