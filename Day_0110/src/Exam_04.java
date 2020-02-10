
public class Exam_04 {
	
	
	
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		arrPrint(arr); // arr의 첫번째 요소의 주소값이 넘어감
		
		int b = 100;
		intPrint(b);
		
		
	}
	 
	static void arrPrint(int[] a) { // []안에 아무것도 없는 이유는 -> 매개변수가 넘어올때 첫번째 값의 주소값이 넘어오기때문
		                            // 값을 받을게 아니니까!
		for(int x = 0; x < a.length; x++) {
			System.out.print(a[x]+"\t");
		}
	}
	static void intPrint(int a) {
		System.out.println(a);
	}
	//메소드에서 생성된 int a는 메소드 실행이 끝나면 int a는 사라짐
	
	
	//결국 간단히 말해서 주소가 넘어가면 주소를 받으면되고 , 값이 넘어 가면 값을 받으면됨
	
}
