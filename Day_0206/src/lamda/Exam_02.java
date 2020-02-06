package lamda;

/*
[함수적 인터페이스]
@functionalInterface
메서드가 하나 밖에 없는 인터페이스
 */

@FunctionalInterface
interface AAA{
	void method();
}

/*
 * class BB implements AAA{
 * 
 * @Override public void method() { System.out.println("AAAAA");
 * 
 * } }
 */

public class Exam_02 {
	public static void main(String[] args) {
		
//		BB b = new BB();
//		b.method();
		
		AAA aa;
		aa = ()->{System.out.println("AAAAA");};
		aa.method();
		
		aa = ()->System.out.println("BBBBB");
		aa.method();
				
		
	}
	

}
