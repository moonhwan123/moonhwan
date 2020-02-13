import java.lang.reflect.Array;
import java.util.Arrays;

/*
오름차순 정렬


 */


public class Exam_07 {
	
	public static void main(String[] args) {
		
		
		int arr[] = {10,34,12,67,6,8,68,34,99};
		
		//정렬 전
		System.out.print("Source Data : ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		
		//정렬 후
		System.out.print("ASC Source Data : ");
		
		
		
		for(int i = 0; i<arr.length-1; i++) {
			for(int j = i + 1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		
		
		//Arrays.sort();
		int arr2[] = {10,34,12,67,6,8,68,34,99};
		Arrays.sort(arr2);
		System.out.print("ASC Source Data : ");
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"\t");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
