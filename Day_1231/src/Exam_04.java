/*
�ݺ���
1. while(���ǽ�){    }
2. do{ ~ } while(���ǽ�)
3. for(���� = �ʱⰪ; ���ǽ�; ������){   }
 */

public class Exam_04 {
	public static void main(String[] args) {
		
		//1.
		int x = 0;
		while(true) { //���ѹݺ�
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
		}while(z==10); //���ǿ� ������� ������ 1���� �����
		
		

		
		
	}

}
