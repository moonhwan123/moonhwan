
public class sam_06 {
	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		boolean sw = true;
		
		while(i<=10) {
			if(sw) {
				sum += i;
				sw=false;
			}else {
				sum += -i;
				sw=true;
			}
			i++;
		}
		
		System.out.println("s = +1-2+3- .... -10 까지의 합계는 "+sum+" 입니다.");
		
	}
}
