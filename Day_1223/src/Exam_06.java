/*
�迭�� ����� data�� ���� ū��, ���� ������ ã��
 */
public class Exam_06 {
	
	public static void main(String[] args) {
		
		int arr[] = {90,20,50,75,318,182,3,5,81,2,85,14,12,34};
		
		System.out.println("[arr data list]");
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(i%7==0) System.out.println();
			System.out.print(arr[i]+"\t");
		}
		
		//�ִ�, �ּ� ã��
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i<arr.length; i++ ) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("\n====================================================");
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
