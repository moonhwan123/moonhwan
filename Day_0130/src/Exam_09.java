import java.util.Arrays;

/*
[Arrays클래스를 이용한 배열의 정렬]
Arrays.sort(arr); -> 기본자료형과 문자열은 정렬이 된다.
 */

public class Exam_09 {
	public static void main(String[] args) {
		
		int arr[] = {90,87,95,80,75,60};
		int var[][] = {{1,90,80,70},{4,60,87,70},{3,20,30,80}}; // 임마는 안됨
		
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);

		
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+" ");
		}
		System.out.println();
		
		String[] name = {"박","이","나","김"};
		
		Arrays.parallelSort(name);
		for(int x = 0; x < name.length; x++) {
			System.out.print(name[x]+" ");
		}
		
		
		
		
		
		
		
	}
}
