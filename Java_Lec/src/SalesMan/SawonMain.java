package SalesMan;

public class SawonMain {

	public static void main(String[] args) {
		Temporary tem = new Temporary("��ġ��", 21, 20, 90000);
		tem.print();
		Regular reg = new Regular("ȫ�浿", 23, 2300000);
		reg.print();
		
		Salesman sal = new Salesman ("�Ѽ���", 25, 230000,300000,300000);
		sal.print();
	}

}
