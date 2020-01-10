
public class sam_05 {
	public static void main(String[] args) {

		int sum = 0;
		int i = 1;
		int y = 1;
		int m;
		while(i<=10) {
			m = i*y;
			sum+=m;
			y*=-1;
			i++;
		}
		System.out.println("s = +1-2+3- .... -10 까지의 합계는 "+sum+" 입니다.");
		
	}
}
