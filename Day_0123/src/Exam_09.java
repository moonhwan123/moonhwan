import java.util.Arrays;
import java.util.Scanner;

/*
Ű����� ���Ӽ� �Է� �޾Ƽ� ���

���Ӽ� �Է� : 5
1 : 4 23 12 3 2 1
2 : 5 6 7 8 9 10 35
.
.
.
 
 */


public class Exam_09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] lotto = new int[6];
		
		
		System.out.print("���� �� �Է� : ");
		int game = sc.nextInt();
		
		for(int x = 0; x < game; x++) {
			
			for(int i = 0; i < lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45+1);
				//���⼭ �ߺ� üũ(for�� �̿�)
				for(int y = 0; y < i; y++) { // x=0�϶��� �۵�����
					if(lotto[i] == lotto[y]) {
						i--;
						break;
					}
				}
			}
			
			Arrays.sort(lotto);
			System.out.print((x+1)+"ȸ)\t");
			for(int a = 0; a < 6; a++) {
				System.out.print(lotto[a]+"\t");
			}
			System.out.println();
			
			
		}
		
		
		
		
	}
}
