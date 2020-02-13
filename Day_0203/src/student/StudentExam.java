package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
1. 키보드 입력
	입력 : 번호, 이름, 점수, 점수, 점수, 점수, 점수
	
	
2. 처리조건
	- 입력시 번호가 '0'이면 입력 종료
	- 번호가 중복시 입력 불가 하도록 처리
	- 총점을 기준으로 석차 부여
	- 한번은 입력 자료 순으로 출력 하고 
	- 한번은 석차를 기준으로 출력 한다.
	
3. 출력
	번호          이름          점수1            점수2   ....   점수5         총점          평균          석차



 */


public class StudentExam {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student s;
		List<Student> stuList = new ArrayList<Student>();
		
		while(true) {
			System.out.print("번호,이름,점수1~5 입력 >> ");
			String str = sc.nextLine();
			String strArr[] = str.split(",");
			int score[] = new int[5];
			
			if(strArr[0].equals("0")) {
				break;
			}
			
			for(int x = 0 ; x < score.length; x++) {
				score[x] = Integer.parseInt(strArr[x+2]);
			}
			
			s = new Student(Integer.parseInt(strArr[0]),strArr[1],score);
			if(stuList.contains(s)) {
				System.out.println("중복된 번호 입니다. 다시 입력 하세요");
			}else {
				stuList.add(s);
			}
			
			
		}
		
		StudentData sd = new StudentData(stuList);
		sd.sourcePrint(); // 원본데이터 출력
		sd.sortdataPrint(); // 정렬후 데이터 출력
		
		

		
		
		
		
	}
}
