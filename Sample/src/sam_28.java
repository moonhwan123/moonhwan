import java.util.Scanner;

public class sam_28 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[2진 검색 프로그램입니다.]");
		int arr[] = {1,5,10,17,28,43,67,88,92};
		
		System.out.print("찾을 정수를 입력 하세요 >> ");
		int key = sc.nextInt();
		int low = 0;
		int high = arr.length-1;
		int mid;
	
		while(true) {
			if(low <= high) {
				mid = (low + high)/2;
			}else {
				System.out.println(key+"은 리스트에 없음");
				break;
			}
			if(key == arr[mid]) {
				System.out.println(key+"은 "+(mid+1)+"번째에 있습니다.");
				break;
			}
			if(key < arr[mid]){
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}

		
		
		
	}
}
