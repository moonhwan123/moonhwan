package OOP;

import java.util.Arrays;

class Data1{
	int x;
	
}

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data1 d = new Data1();
		int[] x = {10};
		

		//d.x = 10;
		//System.out.println("main() : x = "+d.x); // (1)
		
		//change(d); // (2)
		//changeArray(x);
		
		//System.out.println("After change(d.x) : x =" +d.x); // (3)
		
		int[] arr= new int[] {3,2,1,5,6,4};
		
		printArr(arr);
		System.out.println();
		sortArr(arr);
		
		sumArr(arr);
		

	}

	static void change(Data1 d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println("main() : x = "+d.x);
	}
	static void changeArray(int[] x) {
		x[0] = 1000;
		System.out.println("main() : x = "+x[0]);
		
	}
	static void printArr(int[] arr) {
		System.out.print("[");
		for(int i : arr) {
			System.out.print(i+",");
		}
		
		System.out.print("]");
	}
	static void sumArr(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
		}
		System.out.println("sum :"+sum);
	
	}
	
	static void sortArr(int[] arr) {
		for(int i =0; i <arr.length-1; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=tmp;
			
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
