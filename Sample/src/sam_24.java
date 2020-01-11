
public class sam_24 {
	public static void main(String[] args) {
		
		int arr[] = {3,6,2,1,9};
		
		System.out.println("[정렬 전]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}System.out.println();
		
		for(int i = 0; i < arr.length-1; i++) {
			int n = arr.length-1-i;
			for(int j = 0; j < n; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("[정렬 후]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}System.out.println();
		
		
		
		
	}
}
