
public class aaa {

	public static void main(String[] args) {
		String str = "2a5b1c";
		
		String str2;
		for(int x = 0 ; x < str.length(); x+=2) {
			str2 = str.substring(x+1, x+2);
			System.out.println(str2);
		}
		
		for(int x = 0 ; x < str.length(); x+=2) {
			str2 = str.substring(x, x+1);
			System.out.println(str2);
		}
		

	}

}
