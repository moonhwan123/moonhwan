/*
[객체 비교]



 */
class DataA{
	static int id = 10; // static이 붙은 애들은 클래스가 로딩 되는 순간 만들어 지므로, 참조변수를 통하지 않고도 접근이 가능하다.
	int pw = 111;
	
	boolean equals(DataA a) {
		return true;
	}
	
}
public class Exam_08 {
	public static void main(String[] args) {
		
		DataA a1 = new DataA();
		a1.id = 333;
		System.out.println(a1.id);
		DataA.id = 444;
		System.out.println(DataA.id);
		System.out.println(a1.id);
		DataA a2 = new DataA();
		
		System.out.println("a1==a2 : " + (a1==a2));
		
	}
}
