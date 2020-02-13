package SalesMan;

public class SawonMain {

	public static void main(String[] args) {
		Temporary tem = new Temporary("박치기", 21, 20, 90000);
		tem.print();
		Regular reg = new Regular("홍길동", 23, 2300000);
		reg.print();
		
		Salesman sal = new Salesman ("한송이", 25, 230000,300000,300000);
		sal.print();
	}

}
