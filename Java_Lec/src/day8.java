import java.util.Arrays;
import java.util.Scanner;

public class day8 {

	public static void main(String[] args) {
		
		
		/*
		 -배열[Array]
		 	: 같은 자료형의 나열
		 	: 많은 양의 값을 다룰 때 유용하다
		 	: 배열의 각 요소는 연속적으로 이루어져 있다
		 	 
		 -배열의 선언
		 	: 자료형이나 변수이름 뒤에 대괄호[]를 붙여서 선언
		 	: 자료형[] 변수이름; -> int[] score;
		 	: 자료형 변수이름[]; -> int score[];
		 	
		  체크) 배열을 선언한다고 해서 값을 저장할 공간이 생성되지 않는다.
		  	   필요한 변수가 생성
		  	   
		  -배열의 생성
		  	: int[] score; // 배열을 선언한다.
		  	: score = new int[5]; // 배열을 생성한다. 
		  	
		  -배열의 초기화
		  	: 생성된 배열에 처음으로 값을 저장
		  	int[] score = {100,90,60,70,20};
		  	int[] score = new int[]{100,90,60,70,20}
		 
		 */

		int[] score = {100,90,80,70,60};
		System.out.println(score);
		System.out.println();
		/*
		 -배열의 길이와 인덱스
		 	: 배열의 공간마다 붙여진 번호
		 	: 인덱스 번호는 0번부터 부여된다
		 	: 인덱스의 길이는 선언한 크기의 -1
		 */
		
		int[] student = new int[3];
		System.out.println("현재 자동 초기화 된 첫 번째 요소의 값 = "+student[0]); // new는 자동적으로 초기화된다.
		student[0] = 30;
		student[1] = 20;
		student[2] = 10;
		
		//int[] student = new int[]{30,20,10}; 위에랑 같은 말임
		
		System.out.println("현재 첫 번째 요소의 값 = "+student[0]);
		System.out.println("현재 두 번째 요소의 값 = "+student[1]);
		System.out.println("현재 세 번째 요소의 값 = "+student[2]);
		
		System.out.println();
		
		for(int i = 0; i<3; i++) {
			System.out.println(i+"번째 배열의 값 = "+student[i]);
		}
		
		int a[] = new int[] {10,20,30,40,50};
		int b[] = {1,2,3,4,5,6,7};
		int c[] = new int[10];
		
		for(int index_num = 0; index_num <c.length; index_num++) {
			c[index_num]=index_num;
		}
		
		for(int index_num = 0; index_num <c.length; index_num++) {
			System.out.println(c[index_num]);
		}
		
		System.out.println(Arrays.toString(c));
		System.out.println();
		
		// 평균 값 구하기
		// 5명 점수 평균 (Scanner값 입력)
		
		/*
		 [출력결과]
		 점수 입력 : 80
		 점수 입력 : 80
		 점수 입력 : 80
		 점수 입력 : 80
		 점수 입력 : 80
		 평균 점수는 80.00 입니다.
		 
		 // 추가 사항 -1을 입력하기 전까지 입력 받고 평균값 구하기
		 */
		Scanner sc = new Scanner(System.in);
		/*
		int jumsu[] = new int[5];
		int sum = 0;
		double ava = 0;
		
		for(int N = 0; N < jumsu.length; N++) {
			System.out.print("점수 입력 : ");
			jumsu[N] = sc.nextInt();
			sum = sum + jumsu[N]; 
			ava = sum /jumsu.length;
		}
		System.out.printf("평균 점수는 %.2f점 입니다. \n",ava);
		*/
		
		//Arrays API 들
		
		//CopyOf()
		//전달 받은 배열의 특정 길이만큼을 새로운 배열로 복사하여 변환
		
		int[] arr1 = {1,2,3,4,5};
		//int[] arr2 = new int [5];
		
		
		int[] arr2 = Arrays.copyOf(arr1,3);
		for(int i = 0 ; i < arr2.length; i++) {
			System.out.println(arr2[i]+"");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr2));
	
		//copyOfRange()
		//전달 받은 배열의 특정범위에 해당하는 요소만을 새로운 배열로 복사하여 반환
		//매개변수로는 원본 배열에서 복사할 시작 인덱스를 전달 받고, 세번째 매개변수로는 마지막으로 복사될 배열 요소의 바로 다음 인덱스를 전달
		
		int[] arr3 = Arrays.copyOfRange(arr1, 2, 4);
		System.out.println(Arrays.toString(arr3));

		
		
		//fill()
		//전달받은 배열의 모든 요소를 특정 값으로 초기화
		
		int arr[] = new int[10];
		Arrays.fill(arr, 7);
		System.out.println(Arrays.toString(arr));
		
		
		
		//sort()
		//전달받은 배열의 모든 요소를 오름차순으로 정렬
		
		int arr4[] = {5,3,1,2,4};
		
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		System.out.println();
		
		//
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6'};
		
		System.out.println(abc);
		System.out.println(num);
		
		char[] result = new char[abc.length + num.length];
		
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		
		System.out.println(Arrays.toString(result));
		
		
	}

}
