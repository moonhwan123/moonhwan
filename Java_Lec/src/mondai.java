import java.util.Scanner;

public class mondai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//최대공약수
		/*
		 두 수의 최대 공약수 구하기
		 
		 유클리드 호제법
		 1. 두 수 가운데 큰 수를 big, 작은수를 small라고 한다.
		 2. y가 0이면 공약수는 x와 같다.
		 3. nmg = big % small
		 4. big = small
		 5. small = nmg
		 */
		
		
		
		/*
		int A;
		int B;
		int big;
		int small;
		int nmg;
		
		System.out.println("두 수를 입력 해주세요 : ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A>B) {
			big = A;
			small = B;
		}
		else {
			small = A;
			big = B;		
		}
		
		while(small != 0) {
		nmg = big % small;
		big = small;
		small = nmg;
		}
		System.out.println("최대 공약수는"+big);
		*/
		
		
		
		// ================================================================(09-20)
		
		
		
		/*
		 0 이하의 수가 입력 될 때 까지 정수를 계속 입력 받고 5의 배수와 7의 배수를 제외한 수들의 갯수를 출력하는 프로그램
		 
		 [출력결과]
		 값을 입력 하세요 : 100 80 20 28 3 34 2 0
		 5와 7의 배수를 제외한 갯수 : ~~
		 */
		
		/*
		int num=0;
		int count=0;
		System.out.print("값을 입력 하세요 : ");
		
	
		while(true)
		{
			num = sc.nextInt();
			if (num<= 0)
				break;
			if(num % 5 != 0 && num % 7 != 0)
				count++;
		}
		
		System.out.println();
		System.out.println("5와 7의 배수를 제외한 갯수는 "+count+"개 입니다.");
		*/
		
		
		// 2019-09-19 [실습 예제 2번]
		
		
		
		/*
		int A;
		int B;
		System.out.print("두 수를 입력 하세요 : ");
		A= sc.nextInt();
		B= sc.nextInt();
		int DAN;
		int GOP;
		int RESULT;
		
		if(A>B) {
			int tmp = A;
			A = B;
			B =tmp;
		}
		
		for(DAN=A; DAN<=B; DAN++) {
			
			for(GOP=1; GOP<=9; GOP++) {
				RESULT = DAN * GOP;
				System.out.printf("%d * %d = %d \n",DAN,GOP,RESULT);	
			}
		}
		*/
		
		/*
		int A;
		int B;
		System.out.println("두 수를 입력 하세요 : ");
		A= sc.nextInt();
		B= sc.nextInt();
		int DAN;
		int GOP;
		int RESULT;
		
		for(DAN=A; DAN<=B; DAN++) {
			System.out.println("");
			for(GOP=1; GOP<=9; GOP++) {
				RESULT = DAN * GOP;
				System.out.print(DAN+"*"+GOP+"="+RESULT+"\t");	
			}
		}
		*/
		
		//[예제 3번]
		// 초를 입력 받고 ~시~분 ~초 의 형태로 나타내기
		/*
		System.out.print("초를 입력 하세요 : ");
		int time = sc.nextInt();
		int second = time % 60;
		int minute = (time/60) % 60;
		int hour = (time/60) / 60;
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", time,hour,minute,second);
		System.out.println();
		*/
		
		
		//for문 하나만 쓰는 구구단 
		
		int dan = 1;
		int gob = 0;
		for (int i = 9; i < 81; i++) {
			dan = i/9+1;
			gob = i%9+1;
			System.out.printf("%d * %d = %d \n",dan,gob,dan*gob);
		}
		
		
		
		//
		
		
		
		
		
		
		
		
		
		
		
	}

}
