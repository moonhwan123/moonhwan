
public class Exam5_6 {
	public static void main(String[] args) {
		
		int[] coinUnit = {500,100,50,10};
		boolean sw;
		
		int money = 2680;
		System.out.println("money = " + money );
		
		for(int i = 0; i < coinUnit.length; i++) {
			int mok = money/coinUnit[i];
			int nmg = money%coinUnit[i];
			System.out.println(coinUnit[i]+"원 : " + mok);
			money = nmg;
			
		}
		
		
		
	}
}
