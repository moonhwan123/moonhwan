/*
배열의 선언과 동시에 초기화
 */


public class Exam_04 {
	
	public static void main(String[] args) {
		
		int a[] = new int[]{1,2,3,4,5,6,7,8,9};
		
		//배열의 길이
		System.out.println("a배열의 길이 : " + a.length);
		
		for(int i = 0; i < a.length ; i++) { // <= 안쓰도록 주의(인덱스 번호 안맞아서 뒤에 오류뜸)
			System.out.println("a"+"["+i+"]"+" = "+a[i]);
		}
		
		
				
		
	}

}
