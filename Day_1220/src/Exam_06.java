import java.util.Scanner;

/*
[다중 반복문]
for(){
	for(){
	
	}
}

 */
public class Exam_06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int jul_num = sc.nextInt();
		int kan_num = sc.nextInt();
		
		
		
		for(int i = 1; i <= jul_num; i++) {// 줄수
			System.out.print(i + " : ");
			for(int j = 1; j <= kan_num ; j++) { // 줄당 칸수
			System.out.print("*");	
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
