/*
[Wrapper Class]
-오토박싱 : 
-오토언박싱 : 
 */
public class Exam_03 {
	public static void main(String[] args) {
		
		int n = 10; 
		Integer nn = new Integer(n); // 오토박싱을 사용 안 할시 
		
		System.out.println("nn = "+nn); // 객체이지만 주소가아닌 값이 출력 된다. (오토박싱/언박싱 때문임)
		
		Integer nI = n; // 기본자료형이 객체로 바뀜 -> "오토 박싱"
		
		Integer n2 = new Integer(100);
		int n3 = n2; // "오토 언박싱"
		
		System.out.println();
		
		
	}
}
