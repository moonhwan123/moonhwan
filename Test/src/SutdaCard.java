
public class SutdaCard {
	int num; //카드의 숫자(1~10사이의 정수)
	boolean isKwang; // 광이면 true ,아니면 false
	
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
