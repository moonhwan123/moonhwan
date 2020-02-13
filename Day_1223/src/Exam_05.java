import java.util.Scanner;

/*
키보드로 임의의 정수 data 10개 입력
단, data는 50이상 100이하만 입력
 */


public class Exam_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int cnt = 0; //data 갯수 카운트 
		
		
		while(true) {
			System.out.print("정수를 입력 하세요 : ");
			int num = sc.nextInt();
			if(num>=50 && num<=100) {
				arr[cnt] = num;
				cnt++;
				if(cnt == 10)break;
			}
		}
		
		for(int j = 0 ; j<arr.length ; j++) {
			System.out.println("arr"+"["+j+"] = "+arr[j]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
