import java.util.Scanner;

public class sam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===���� ū��, �߰���, ���� �������� ã�� ���α׷� �Դϴ�.===");
		System.out.print("���� 3���� �Է� �ϼ���(�ϳ��� �Է��ϰ� �����̽� �� �ٽ� �Է� ) >> ");
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
		
		System.out.println("���� ū ���� "+ max+" �Դϴ�.");
		System.out.println("�߰� ���� "+ mid+" �Դϴ�.");
		System.out.println("���� ���� ���� "+ min+" �Դϴ�.");
		
	}
}
