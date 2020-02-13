/*

[싱글톤] - Singleton 
-생성자의 접근제어자
-일반적으로 생성자의 접근제어자는 클래스의 접근제어자와 일치
-생성자에 접근제어자를 사용하므로써 인스턴스의 생성을 제한 가능

>> new를 못쓰게 해야할때
>> 객체를 공유 하고 싶을때 사용한다.
>> 데이터베이스와 연동할때

 */

class DataB{
	private static DataB data = new DataB();
	// 자기가 자기자신의 객체를 생성한후 자기만 안에서 쓰기로 한다.
	private DataB() {
		// 생성자에 private붙이면 new못씀
	}
	static DataB getInstance() {
		return data;
	}
	//static이 붙은 멤버변수나 메소드는 "클래스 이름"으로 직접 호출한다.
}
public class Exam_09 {
	public static void main(String[] args) {
		
		DataB d1 = DataB.getInstance();
		DataB d2 = DataB.getInstance();
		
		System.out.println("d1 == d2 : " + (d1==d2));
		
		
		
	}
}
