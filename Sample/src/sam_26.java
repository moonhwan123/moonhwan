
public class sam_26 {
	public static void main(String[] args) {
		
		int arr[] = {2,1,7,3,9};
		
		System.out.println("[정렬 전]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}System.out.println();
		
		
		int j=0;
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			for(j = i-1; j >= 0; j--) {
				if(key < arr[j]) {
					arr[j+1] = arr[j];
				}else break;
			}
			arr[j+1] = key;
		}
		
		
		System.out.println("[정렬 후]");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}System.out.println();
		
	}
}
