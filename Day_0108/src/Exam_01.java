import java.util.Scanner;

/*
키보드 입력 (1 ~ 10) -> 7개 입력
입력 : 5
입력 : 0
입력 오류 
입력 : 9
.....
-> 7개 입력시 출력 
[출력]
입력 자료 : 5 9 x x x x x
최대값 : 
최소값 : 
합계(최대, 최소를 뺀 합계) : 

 */

public class Exam_01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[7];
		int cnt = 0;

		//입력
		while(cnt<7) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			if(num >= 1 && num <= 10) {
				arr[cnt] = num;
				cnt++;
			}else System.out.println("입력 오류");
		}
		//최대,최소,합계
		int max = arr[0]; // int max = -999
		int min = arr[0]; // int min = 999
		int sum = arr[0]; // int sum = 0; // 체크필요
		
		for(int x = 1; x < arr.length; x++) {
			if(max<arr[x]) {
				max = arr[x];
			}
			if(min>arr[x]) { // else if 하면 안됨 (독립된거)
				min = arr[x];
			}
			sum+=arr[x];
		}
		
		//입력자료 출력
		System.out.print("입력 자료 : ");
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("최대,최소를 뺀 합계 : " + (sum-max-min));
		
		
		
		
		
		
		
	}
}
