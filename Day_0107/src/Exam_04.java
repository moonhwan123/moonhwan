import java.util.Scanner;

/*
키보드 입력 (2~100)
입력값이 -99이면 종료
입력자료 중 소수를 구하여 출력(최대 5개)

입력 : 5
...
입력 : -99
소수 : XX	XX XX XX
 */

public class Exam_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sosu[] = new int[5];
		int pcnt = 0;
		
		while(true) {
			System.out.print("입력 : ");
			num = sc.nextInt();
			
			if(num == -99||pcnt == 5) break;
			
			if(num>=2 && num<=100) {
				for(int i = 2; i <= num; i++) {
					if(num%i == 0) {
						if(num==i) {
							sosu[pcnt] = num;
							pcnt++;
						}else break; 
					}
				}

			}else System.out.println("잘못된 입력값");
			
		}
		System.out.println("<소수리스트>");
		for(int j = 0; j < pcnt; j++) {
			System.out.print(sosu[j]+"\t");
		}
		
		
	}
}
