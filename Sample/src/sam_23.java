
public class sam_23 {
	public static void main(String[] args) {
		
		int arr[] = {2,6,4,1,9};
		System.out.println("[정렬 전]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}System.out.println();
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("[정렬 후]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		
	}
}
