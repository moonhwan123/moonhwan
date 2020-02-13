import java.util.Arrays;
import java.util.Scanner;

public class array_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//단어 맞추기
		/*
		String[][] words = {
				// 0,0    0,1
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		
		
		for(int i = 0 ; i < words.length; i++) {
			System.out.printf("Q%d. %s 의 뜻은?", i+1,words[i][0]);
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("정답 입니다. \n\n");
			
			}
			else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다.\n\n",words[i][1]);
			}
		}
		*/
	
		
	// 입력받은 숫자만큼의 행을 가지는 사각형 채우기
	// (지그재그, 달팽이, 마방진)
		
		//일반
		/*
		System.out.print("숫자를 입력 하세요 >");
		int num = sc.nextInt();
		int cnt = 1;
		int[][] lec = new int[num][num];
		
		
		for(int i = 0; i < lec.length; i++) {
			for(int j = 0; j < lec.length; j++) {
				lec[i][j] = cnt;
				cnt++;
				System.out.printf("%d \t",lec[i][j]);
			}
			System.out.println();
		}
		*/
		
		
		//지그재그
		System.out.println("지그 재그 배열");
		System.out.print("숫자를 입력 하세요 >");
		int num = sc.nextInt();
		int cnt = 1;
		int[][] lec = new int[num][num];
		
		for(int i = 0; i < lec.length; i++) 
		{
			if(i%2 == 0) 
			{
			for(int j = 0; j < lec.length; j++) {
					lec[i][j] = cnt;
					cnt++;
					}
			}
			else 
			{
				for(int j = lec.length-1; j >= 0; j--){
					lec[i][j] = cnt;
					cnt++;
				}
			}
			
		}
		for(int i = 0; i < lec.length; i++) {
			for(int j = 0; j < lec.length; j++) {
				System.out.printf("%3d \t",lec[i][j]);
			}
			System.out.println();
		}
		
		
		
	// 10개의 정수를 1차원 배열에 입력 받고 최대,최소,합,평균 구하기
		
		/*
		int sum = 0;
		double ava = 0;
		int[] NUM = new int[10]; 
		
		System.out.print("정수를 입력 해 주세요 > ");
		
		for(int I = 0; I < NUM.length; I++) {
		NUM[I] = sc.nextInt();
		sum = sum+NUM[I];
		}
		
		ava = sum/NUM.length;
		Arrays.sort(NUM);
		
		System.out.printf("최대 : %d \n",NUM[0]);
		System.out.printf("최소 : %d \n",NUM[9]);
		System.out.printf("합계 : %d \n",sum);
		System.out.printf("평균 : %.2f \n",ava);
		*/
		
		System.out.println();
		
		
		
		
		
	// 길이가 10인 배열을 선언하고, 숫자를 각 배열안에 입력 받은 후 -> 입력 받은수 : 홀수 일때 배열의 앞 부터 // 입력 받은수가 : 짝수 배열의 뒤 부터	
		
		/*
		int bae[] = new int[10];
		int num_2,front = 0, rear = 9;
		
		System.out.println("총 10개의 숫자 입력 > ");
		
		for(int i_2 = 0; i_2 < bae.length; i_2++) 
		{
			
			System.out.print("? : ");
			num_2 = sc.nextInt();
			
			if(num_2 % 2 != 0) {
				bae[front] = num_2 ;
				++front;
			}
			else {
				bae[rear] = num_2 ;
				--rear;
			}
			
			
		}
		System.out.println("배열 요소 출력");
		for(int i_2 = 0; i_2 < bae.length; i_2 ++) {
			System.out.print(" "+bae[i_2]);
		}
		*/
		
		

		
		
		
		
		
		

	}

}
