import java.util.Scanner;

/*
[리턴타입과 매개변수가 있는 경우]

키보드로 정수 입력
입력된 정수 까지 합계 출력

 */
public class Exam_08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		
		int num = sc.nextInt();
		int ss = intSum(num);
		System.out.println(ss);
	}
	
	static int intSum(int a) { // 배열은 리턴 값이 필요없다. why? 값이 넘어 가는게 아니기 때문
		int sum = 0;
		
		for(int x = 1; x <= a; x++) {
			sum+=x;
		}

		return sum;
	}
	//뭔가 메소드의 결과값으로 무엇인가를 해야 할 경우는 리턴값이 필요하다.

}
