package OOP2;


/*
[추상 클래스]
	-클래스가 설계도 라면, 추상클래스는 '미완성 설계도'
	-추상메서드를 하나이상 포함하고 있는 클래스
	-일반메서드가 추상메서드를 호출하는 것은 가능(호출시 필요한것은 선언부)
	-완성된 형태가 아니므로 '인스턴스 생성이 안됨'
	-다른 클래스를 작성 하는데에 도움되기 위한 목적
	
[추상 메서드]
	-선언부만 있고, 구현부가 없는 메서드
	-꼭 필요하지만 자식마다 다르게 구현될 경우 사용(강제성 부여)
	-추상클래스를 상속받은 자식클래스에서 추상메서드 구현부를 완성
 */

abstract class Pokemon{
	// 포캣몬의 추상클래스
	String name;
	
	abstract void attack(); // 공격 추상메서드
	abstract void sound(); // 소리 추상메서드
	
	public String getName() {
		return this.name;
	}
}

class Pikachu extends Pokemon{
	
	public Pikachu() {
		this.name = "피카츄";
	}
	
	@Override
	void attack() {
		System.out.println("전기 공격");
	}

	@Override
	void sound() {
		System.out.println("피카 피카");
	}
	
}

class Squirtle extends Pokemon{
	public Squirtle () {
		this.name = "꼬부기";
	}

	@Override
	void attack() {
		System.out.println("물대포 공격");
		
	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북");
		
	}
}



public class AbstractTest {

	public static void main(String[] args) {
		
		Pikachu pikachu = new Pikachu();
		System.out.println("이 포켓몬은 : "+pikachu.getName());
		pikachu.attack();
		pikachu.sound();
						
		
	}

}
