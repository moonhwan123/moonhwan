/*
반복문
1. while(조건식){    }
2. do{ ~ } while(조건식)
3. for(변수 = 초기값; 조건식; 증감식){   }
 */

public class Exam_04 {
	public static void main(String[] args) {
		
		//1.
		int x = 0;
		while(true) { //무한반복
			System.out.println("x = " + x);
			x++;
			if(x == 10) {
				break;
			}
		}
		
		System.out.println();
		
		//2.
		int y = 0;
		while(y<10) { 
			System.out.println("y = " + y);
			y++;
		}
		
		System.out.println();
		
		//3.
		int z = 0;
		do{ 
			z++;
			System.out.println("z = " + z);
		}while(z==10); //조건에 관계없이 무조건 1번은 실행됨
		
		

		
		
	}

}
