
public class sam_04 {
	public static void main(String[] args) {
		System.out.println("====1 ~ 10 까지의 합계를 구하는 프로그램 입니다.====");
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum+=i;
		}
		System.out.println("1 ~ 10 까지의 합은 "+sum+"입니다.");
	}
}
