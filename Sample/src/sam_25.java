
public class sam_25 {
	public static void main(String[] args) {
		
		int arr[] = {3,6,2,1,9};
		
		System.out.println("[정렬 전]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}System.out.println();
		
		for(int i = 0; i < arr.length-1; i++) {
			boolean sw = true;
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					sw = false;
				}
			}
			if(sw == true) break;
		}
		
		System.out.println("[정렬 후]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}System.out.println();
		
		
	}
}
