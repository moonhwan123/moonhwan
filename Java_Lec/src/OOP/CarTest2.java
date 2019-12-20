package OOP;
/*
 [�����ڿ��� �ٸ� ������ ȣ���ϱ�]
 	this() - ������ ȣ��, this - ��������,�ν��Ͻ� �ڽ��� ����Ų��.
 	
 	-������ �̸����� Ŭ���� �̸���� this�� ���
 	-�� �����ڿ��� �ٸ� �����ڸ� ȣ���� ���� �ݵ�� ù�ٿ����� ����
 		>�ʱ�ȭ �۾� ���� �ٸ� �����ڸ� ȣ�� ��, ȣ��� �ٸ� ������ �������� �ɹ��������� ���� �ʱ�ȭ �� �� ����
 */
public class CarTest2 {

	public static void main(String[] args) {
		Car1 k3 = new Car1("red","auto",2);
		Car1 k5 = new Car1();
		Car1 k7 = new Car1(k3);
	}

}


class Car1{
	String color; //����
	String geartype; //��������
	int door; // ���� ����
	Car1(){
		this("white","manual",3);
	}
	Car1(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	Car1(Car1 a){
		this.color = a.color;
		this.geartype = a.geartype;
		this.door = a.door;
		
	}
}
	