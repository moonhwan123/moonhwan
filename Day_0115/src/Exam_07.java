import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Sawon[] sa = new Sawon[10];
		
		int cnt =0;
		
		while(cnt<10) {
			System.out.print("입력 : ");
			int sab = sc.nextInt();
			if(sab == -99) {
				break;
			}
			String na = sc.next();
			int pa = sc.nextInt();
			sa[cnt] = new Sawon(sab,na,pa);
			cnt++;
		}
		
		SawonData saD = new SawonData();
		saD.sourceDataPrint(sa, cnt); // 원본 데이터 출력
		System.out.print("사원번호를 기준으로 정렬(1:오름차순/2:내림차순) : ");
		int n = sc.nextInt();
		saD.sortDataPrint(sa,cnt,n); // 소트 실행 , n은 
		saD.sourceDataPrint(sa,cnt); // 소트 후 데이터 출력
		
		
	}
}
