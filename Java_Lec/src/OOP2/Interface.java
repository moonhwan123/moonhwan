package OOP2;
/*
[인터페이스]
	
	(특징)
	-일종의 추상클래스 (추상클래스보다 추상화 정도가 높다.)
	-실제 구현된 것이 전혀 없는 기본 설계도
	-추상메서드와 상수만을 멤버로 가진다
	-인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄 목적으로 사용
	-미리 정해진 규격에 맞게 구현하도록 표준을 제시하는데 사용
	
	
	(사용 방법)
	interface 인터페이스이름 {
		public static final 타입상수이름 = 값;
		public abstract 메서드이름(매개변수목록); 
	}
	
		//class 대신 interface를 사용한다는 것 외에는 클래스와 동일
		//모든 멤버 변수는 public static final 이어야 하며, public static final는  생략가능
		//모든 메서드는 public static final 이어야 하며, public static final는  생략가능 (하나 되도록이면 써주자)	
	
	
	(장점)
	-개발시간 단축
	-표준화 가능(정형화된 개발)
	-서로 관계없는 클래스도 관계부여 가능
	-독립적인 프로그래밍이 가능
 */

public class Interface {

	public static void main(String[] args) {
		
		Figther f = new Figther();
		Fightable f1 = new Figther();
		// 인터페이스 타입의 변수로 인터페이스를 구현한 클래스의 인스턴스 참조가능
		
		if(f instanceof Unit) {
			System.out.println("f는 Unit클래스의 자식입니다.");
		}
		if(f instanceof Fightable) {
			System.out.println("f는 Fightable을 구현 했습니다.");
		}
		if(f instanceof Movable) {
			System.out.println("f는 Movable을 구현 했습니다.");
		}
		if(f instanceof Object) {
			System.out.println("f는 Object클래스의 자식 입니다.");
		}
		
		

	}

}

class Unit{
	int currentHp;
	int x;
	int y;
	
}

class Figther extends Unit implements Fightable{
	//인터페이스 구현 = 클래스 상속
	//인터페이스에 정의된 추상메서드 필히 완성
	//상속과 구현 동시에 가능

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

	
}

interface Fightable extends Movable,Attackable{
	//클래스처럼 상속 가능 (다중 상속 허용)
	//Object 클래스와 같은 최고 조상 X
	
}
interface Movable{
	public abstract void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}
