import java.util.Arrays;
import java.util.Scanner;

public class array_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// <�ζ� ��ȣ ������> 
		// 1~45 ������ 6���� ���� �߻�
		// �ߺ��� �� ���� (����)
		/*
		 [��°��]
		 10 15 23 2 43 23
		 */
		// ���� -> ������ = (int)(Math.random()*N+N);
		
		/*
		int i = 0;
		int[] rotto = new int[6];
		
		for(i=0; i<rotto.length; i++) {
		rotto[i] = (int)(Math.random()*45+1);
		}
		System.out.println(Arrays.toString(rotto));
		*/
		
		
		
		/*
		int[] ball = new int [45];
		
		for(int i = 0 ; i<ball.length; i++) {
			ball[i]=i+1;
		}
		
		int temp = 0;
		int j = 0;
		
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random()*45+1);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i = 0 ; i < 6; i++) {
			System.out.printf("ball[%d] = %d\n",i+1,ball[i]);
		}
		*/
	
		
		//System.out.println(Arrays.toString(ball));
		
		
		
		
		//<��������>
		/*
		System.out.println("<���� ����>");
		int[] arr_bubble = {254,3,213,54,23,25,4,1,7,90};
		int temp = 0;
		
		System.out.println("���� ��");
		System.out.println(Arrays.toString(arr_bubble));
		
		for(int i = 0; i<arr_bubble.length ; i++) {
			for(int j = 0 ; j<arr_bubble.length-i-1; j++) {
			
			if (arr_bubble[j]>arr_bubble[j+1]) {
				temp = arr_bubble[j+1];
				arr_bubble[j+1] = arr_bubble[j];
				arr_bubble[j] = temp;
			}
		 }
		}
		System.out.println("���� ��");
		System.out.println(Arrays.toString(arr_bubble));
		*/
		
		//<��������>
		System.out.println("<���� ����>");
		int[] arr_sap = {2,3,12,35,21,17,86,34,56};
		int key = 0;
		
		for(int i = 1; i < arr_sap.length; i++) {
			for(int j = i; j > 0; j--) {
				
				if(arr_sap[j-1]>arr_sap[j]) 
				{
					key = arr_sap[j-1];
					arr_sap[j-1] = arr_sap[j];
					arr_sap[j] = key;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr_sap));
		for(int test : arr_sap) {
			System.out.printf("%d  ",test);
		}
		
		
		
		/*
		 -foreach
		 	: �迭�� ��ȯ�� ������ �ݺ��� ���� ���� �۾� ���
		 	
		 	: for(�迭�� �ڷ��� �����̸� : �迭�̸�){
		 		��ɹ�
		 	}
		 	
		 	: ���� ���� -> �б⸸ ����(���� �ȵ�)
		 	         -> ���� �Ұ�, �� �״�� ������� �ϳ����� ���� ����
		 	
		 */
		
		System.out.println();
		
		String[] str = {"Java", "Hello", "programing"};
		
		for(String i : str) {
			System.out.println(i);
		}
		
		int[] num_for = {1,2,3,4,5};
		
		for(int i : num_for) {
			System.out.println(i);
		}
		
		/*
		 -2���� �迭
		 	: ��� ���� �̷���� �迭
		 	
		 	: �ڷ��� [][] �迭�̸�;
		 	: int[][] student;
		 	
		 -����
		 	: int[3][2] student = new int[3][2];
		 	
		 -�ʱ�ȭ
		 	: int[][] student = {{100,200,300},{1,2,3},{4,5,6}};
		 	: int[][] student = {
		 	                     {100,200,300},
		 	                     {1,2,3},
		 	                     {4,5,6}
		 	                     };
		 	
		 */
		int[][] student = {
                 {100,200,300},
                 {1,2,3},
                 {4,5,6}
                 };
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("student[%d][%d} = %d\t",i,j,student[i][j]);
			}
			System.out.println();
		}
		int K = 0;
		int[][] AAA = new int[5][7];
		
		for(int I = 0; I<5; I++) {
			for(int J = 0; J<7; J++) {
				AAA[I][J] = K;
				K++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
