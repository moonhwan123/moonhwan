package OOP2;

public class RepairbleTest {

	public static void main(String[] args) {
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		Marine marine = new Marine();
		SCV scv = new SCV();
		
		scv.repair(dropship);
		scv.repair(tank);
		scv.repair(scv);
		//scv.repair(marine);
		

	}

}

interface Repairable {
	
}

class Unit2{
	int hitpoint;
	final int MAX_HP;
	
	public Unit2(int hp) {
		this.MAX_HP = hp;
	}
		
}

class GroundUnit extends Unit2{
	public GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit2{
	public AirUnit(int hp) {
		super(hp);
	}
}

class Marine extends GroundUnit{

	public Marine() {
		super(40);
		hitpoint = MAX_HP;	
	}
	public String toString() {
		return "Marine";
	}
}

class Tank extends GroundUnit implements Repairable{

	public Tank() {
		super(150);
		hitpoint = MAX_HP;	
	}
	public String toString() {
		return "Marine";
	}
}

class SCV extends GroundUnit implements Repairable{

	public SCV() {
		super(60);
		hitpoint = MAX_HP;	
	}
	public String toString() {
		return "SCV";
	}
	void repair(Repairable r) { // Repairable r = new Tank();
		//Ÿ���� Repairable�̹Ƿ� �������̽� Repairable�� ���ǵ� ����� ��밡��
		if (r instanceof Unit2) {
			Unit2 u = (Unit2)r;
			while(u.hitpoint != u.MAX_HP) {
				u.hitpoint++;
			}
			System.out.println(u.toString()+"�� ������ �������ϴ�.");
		}
	}
}

class DropShip extends AirUnit implements Repairable{

	public DropShip() {
		super(125);
		hitpoint = MAX_HP;
	}
	public String toString() {
		return "DropShip";
	}
	
}
