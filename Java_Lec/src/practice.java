import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//2019-09-08
		//예제 1번//
		/*
		int A = 20; int B = 25; int C = 30;
		int sum = A + B + C;
		char Que = '?';
		String intro = "Hello? My name is 길동";
		
		System.out.printf("a와 b와 c의 합은 : %d입니다.\n" , sum);
		System.out.printf("%s \n",intro);
		System.out.printf("%c \n",Que);
		
		System.out.println();
		
		//예제 2번//
		
		
		
		double Pie = 3.14;
		System.out.print("반지름의 길이를 입력 해주세요 : ");
		double Ban = sc.nextFloat();
		double result = Ban * Ban * Pie;
		
		System.out.printf("반지름이 %.1f인 원의 넓이는 %.1f입니다.",Ban,result);
		
		System.out.println();
		*/
		
		//2019-09-18
		//예제 1번
		/*
		System.out.println();
		System.out.print("숫자를 입력 하세요 : ");
		int sut = sc.nextInt();
		int St = 0;
		int Ed = 0;
		
		if (sut>0 && sut<30) {
			if (sut<10 ){
				St = 0;
				Ed = 10;
			}
			else if (sut<20) {
				St = 10;
				Ed = 20;
			}
				
			else if (sut<30) {
				St = 20;
				Ed = 30;
			}
			System.out.printf("%d이상 %d미만",St,Ed);
		}
	
		else
			System.out.println("유효한 값이 아닙니다.");
		
		sc.close();
		*/
		
		
		//예제 2번
		
		
		//예제 3번
		
		
		
		
		//가위,바위,보 게임 (random함수)
		
		//int i = (int)(Math.random()*45+1); //원래는 0부터 45 까지지만 +1을 해주면 1부터 45 까지 가능
		//System.out.println(i);
		int user,com;
		String user_tmp;
		String com_tmp;
		
		System.out.print("가위(1) 바위(2) 보(3) 중에 하나를 입력 하세요 >>> ");
		user = sc.nextInt();
		com = (int)(Math.random()*3+1);
		user_tmp = "";
		com_tmp = "";
		
		switch(user) {
		case 1 :
			user_tmp = "가위";
			break;
		case 2 :
			user_tmp = "바위";
			break;
		case 3 :
			user_tmp = "보";
			break;
		}
		switch(com) {
		case 1 :
			com_tmp = "가위";
			break;
		case 2 :
			com_tmp = "바위";
			break;
		case 3 :
			com_tmp = "보";
			break;
		}
		
		System.out.println("당신은 "+user_tmp+" 입니다.");
		System.out.println("컴퓨터는 "+com_tmp+" 입니다.");
		
		switch(user-com) {
		case 2: case -1:
			System.out.println("당신은 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신은 이겼습니다.");
			break;
		case 0:
			System.out.println("당신은 비겼습니다.");
			break;	
		}
		
		
		
		
		sc.close();
		
		
		
		
		
		
	
	}

}
