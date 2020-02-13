package API;

public class Wrapper_auto {

	public static void main(String[] args) {
		
		int i1 = 10;
//		Integer wi = new Integer(i1);    --> 박싱
		Integer wi = i1; // --> 오토박싱
		
//		int i2 = Integer.valueOf(wi);     --> 언박싱
		int i2 = wi; // --> 오토 언박싱
		
		double dl = 3.14;
		Double wd = dl; // -->  오토박싱
		double dl2 = wd; // -->  오토언박싱
		
		
		/*
		참조적으로 래퍼(Wrapper) 클래스에 대입된 값은 
		== , != 와 같은 비교 연산자를 이용하여 값의 비교 불가
		인스턴스 생성으로 인해 heap 메모리에 값이 저장되고 변수는 참조값을 가진다.
		
		equals() 메서드 이용 또는 , 데이터를 언박싱하여 값을 비교
		
		
		 */
		

	}

}
