
public class SutdaCard {
	int num; //ī���� ����(1~10������ ����)
	boolean isKwang; // ���̸� true ,�ƴϸ� false
	
	SutdaCard() {
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.isKwang = isKwang;
		this.num = num;
	}
	
	void info(){
		System.out.print(num);
		if ( isKwang == true) {
			System.out.println("k");
		}else {
			System.out.println("");
		}
	}
	
}
