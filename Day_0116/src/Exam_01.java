import java.util.Scanner;

/*
클래스 배열 처리 
키보드 입력 - 최대 10명
입력 : 번호  이름  국어  영어  수학 
번호가 -99이면 종료


출력 (석차를 기준으로 오름 차순)
번호  이름  국어  영어  수학  총점  평균  석차 

1. 학생 정보 Student 클래스
2. 학생 정보 처리 StudentData
3. 자료 입력 main()
 */
public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력 작업
		Student cls1[] = new Student[10];
		int cnt = 0;
		while(cnt<10) {
			System.out.print("입력 : ");
			int bun = sc.nextInt();
			if(bun == -99) break;
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();
			cls1[cnt] = new Student(bun,name,kor,eng,mat);
			cnt++;
		}
		

		StudentData sd = new StudentData();
/*		
		//석차 , 정렬 처리
		sd.rank(cls1, cnt);
		sd.sort(cls1, cnt);
		
		// 처리 후 데이터 출력
		sd.clsDataPrint(cls1, cnt);
*/
		
		StudentData2 sd2 = new StudentData2(cls1, cnt);
		sd2.rankAcc();
		sd2.sort2();
		sd2.clsDataPrint();
		
		
	}
}
