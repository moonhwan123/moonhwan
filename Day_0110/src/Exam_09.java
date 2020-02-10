import java.util.Scanner;

/*
Source Data :  ------
Sort Data : ------

2. 오름 차순 정렬은 메소드 이용
 */
public class Exam_09 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int source[] = new int[10];
		
		//배열 입력	
		System.out.print("배열 입력 : ");
		for(int x = 0; x < 10; x++) {
			source[x] = sc.nextInt();
		}
		
		//Source Data
		printData("Source",source);
		//정렬메소드 호출
		arrSort(source);
		//정렬후 출력
		printData("Sort",source);
		
		
	}
	//선택정렬 메서드
	static void arrSort(int arr[]) {
		for(int x = 0; x < arr.length-1; x++) {
			for(int  y = x+1; y < arr.length; y++) {
				if(arr[x]>arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}//두번째 for문 끝
		}//첫번째 for문 끝
	}//메소드 끝
	
	//배열 출력 메서드
	static void printData(String str,int[] arr) {
		System.out.println("["+str+"Data]");
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+"\t");
		}
		System.out.println();
	}
	
	
}