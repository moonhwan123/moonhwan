import java.util.Scanner;

/*
키보드로 급여를 입력(1 ~ 500,000)
입력 자료가 -999 이면 종료 또는  인원수는 최대 10명

[토탈 갯수]
50,000 : xx
10,000 : xx
5,000  : xx
.
.
.
1 : xx
 */
public class Exam_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		int sum[] = new int[10];
		int total[] = new int[10];
		int inwon = 0;
			
		while(true) {
			int kyuryo;
			int m = 50000;
			boolean sw = true;
			System.out.print("급여를 입력 하세요(1 ~ 500,000) >> ");
			kyuryo = sc.nextInt();
			
			if(kyuryo == -999) break;
			if(inwon == -999) break;
				
				for(int x = 0; x <= 9; x++) {
					
					int mok = kyuryo / m ;
					sum[x] = mok;
					
					if(sw) {
						kyuryo = kyuryo%m; 
						m = m/5;
						sw = false;
					}else {
						kyuryo = kyuryo%m;
						m = m/2;
						sw = true;
					}
					total[x]= total[x]+sum[x];
				}
				inwon++;

		}
		
		int m = 50000;
		boolean sw = true;
		
		for(int x = 0; x <= 9; x++) {
			System.out.println(m+" : "+total[x]);
			if(sw) {
				m = m/5;
				sw = false;
			}else {
				m = m/2;
				sw = true;
			}
			
		}
		System.out.println("인원 : "+inwon);
		
		
		
	}
}
