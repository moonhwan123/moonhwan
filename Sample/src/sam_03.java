import java.util.Scanner;

public class sam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===가장 큰수, 중간값, 가장 작은값을 찾는 프로그램 입니다.===");
		System.out.print("정수 3개를 입력 하세요(하나를 입력하고 스페이스 후 다시 입력 ) >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max;
		int mid;
		int min;
		
		if(a>b) {
			if(a>c) {
				max = a;
				if(b>c) {
					mid = b;
					min = c;
				}else {//(b<c)
					mid = c;
					min = b;
				}
			}else {//(a<c)
				max = c;
				mid = a;
				min = b;
			}
		}else { //(a<b)
			if(b>c) {
				max = b;
				if(a>c) {
					mid = a;
					min = c;
				}else {//(a<c)
					mid = c;
					min = a;
				}
			}else {//(b<c)
				max = c;
				mid = b;
				min = a;
			}
		}
		
		System.out.println("가장 큰 값은 "+ max+" 입니다.");
		System.out.println("중간 값은 "+ mid+" 입니다.");
		System.out.println("가장 작은 값은 "+ min+" 입니다.");
		
	}
}
