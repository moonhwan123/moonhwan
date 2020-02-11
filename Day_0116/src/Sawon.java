
public class Sawon {
	int sabun;
	String name;
	int pay;
	int money[] = new int[10];
	
	Sawon(){}
	Sawon(int sabun, String name, int pay){
		this.sabun = sabun;
		this.name = name;
		this.pay = pay;
		
	}
	
	void sPrint() {
		System.out.print(sabun+"\t"+name+"\t"+pay+"\t");
		for(int x = 0 ; x < money.length; x++) {
			System.out.print(money[x]+"\t");
		}System.out.println();
	}
	
	void payAccount() {
		int temp = this.pay;
		int don = 50000;
		boolean sw = true;
		for(int x = 0; x < money.length; x++) {
			money[x] = temp/don;
			temp = temp%don;
			if(sw) {
				don=don/5;
				sw=false;
			}else {
				don=don/2;
				sw=true;
			}
		}//for문끝
	}
	
	
}
