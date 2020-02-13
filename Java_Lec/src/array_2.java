import java.util.Arrays;
import java.util.Scanner;

public class array_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// <로또 번호 생성기> 
		// 1~45 숫자중 6개의 난수 발생
		// 중복된 값 제거 (선택)
		/*
		 [출력결과]
		 10 15 23 2 43 23
		 */
		// 랜덤 -> 변수명 = (int)(Math.random()*N+N);
		
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
		
		
		
		
		//<버블정렬>
		/*
		System.out.println("<버블 정렬>");
		int[] arr_bubble = {254,3,213,54,23,25,4,1,7,90};
		int temp = 0;
		
		System.out.println("정렬 전");
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
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(arr_bubble));
		*/
		
		//<삽입정렬>
		System.out.println("<삽입 정렬>");
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
		 	: 배열의 순환시 기존의 반복문 보다 편리한 작업 기능
		 	
		 	: for(배열의 자료형 변수이름 : 배열이름){
		 		명령문
		 	}
		 	
		 	: 주의 사항 -> 읽기만 가능(쓰기 안됨)
		 	         -> 역순 불가, 말 그대로 순차대로 하나씩만 실행 가능
		 	
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
		 -2차원 배열
		 	: 행과 열로 이루어진 배열
		 	
		 	: 자료형 [][] 배열이름;
		 	: int[][] student;
		 	
		 -생성
		 	: int[3][2] student = new int[3][2];
		 	
		 -초기화
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
