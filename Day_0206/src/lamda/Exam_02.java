package lamda;

/*
[�Լ��� �������̽�]
@functionalInterface
�޼��尡 �ϳ� �ۿ� ���� �������̽�
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
