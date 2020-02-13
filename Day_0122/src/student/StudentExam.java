package student;

import java.util.Scanner;

public class StudentExam {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] stu = new Student[10];
		Student s ;
		int cnt = 0;
		char check;
		int imsi;
		int imsi1;
		int imsi2;
		int imsi3;
		String imsiStr;
		
		while(cnt<10) {
			System.out.print("입력(번호,이름,국,영,수) >> ");
			String str = sc.nextLine();
			
			String[] str1 = str.split(",");
			
			if(str.equalsIgnoreCase("end")) break;
			
			//숫자 오류 판별
			check = str1[0].charAt(0);
			if(Character.isDigit(check)) { // 만족시 숫자임
				imsi = Integer.parseInt(str1[0]);
				if(imsi < 1 || imsi > 10) {
					System.out.println("숫자 범위 초과 오류, 다시 입력 하세요!");
					break;
				}
			}else { // 숫자 아님
				System.out.println("숫자가 아닙니다. 다시 입력 하세요!");
				break;
			}
			//이름판별
			if(str1[1].length() < 1 || str1[1].length() > 10) {
				System.out.println("이름이 적절하지 않습니다. 다시 입력 하세요!");
				break;
			}
			
			//국어점수판별
			imsiStr = str1[2].trim();
			check = imsiStr.charAt(0);
			if(Character.isDigit(check)) { // 이거 넘으면 국어점수는 숫자다
				imsi1 = Integer.parseInt(imsiStr);
				if(imsi1 < 0 || imsi1 > 100) {
					System.out.println("점수 입력 오류! 다시입력하세요!");
					break;
				}
			}else { // 숫자 아님
				System.out.println("올바른 국어점수가 아닙니다. 다시 입력 하세요!");
				break;
			}
			//영어점수판별
			imsiStr = str1[3].trim();
			check = imsiStr.charAt(0);
			if(Character.isDigit(check)) { // 이거 넘으면 국어점수는 숫자다
				imsi2 = Integer.parseInt(imsiStr);
				if(imsi2 < 0 || imsi2 > 100) {
					System.out.println("점수 입력 오류! 다시입력하세요!");
					break;
				}
			}else { // 숫자 아님
				System.out.println("올바른 영어점수가 아닙니다. 다시 입력 하세요!");
				break;
			}
			//수학점수판별
			imsiStr = str1[4].trim();
			check = imsiStr.charAt(0);
			if(Character.isDigit(check)) { // 이거 넘으면 국어점수는 숫자다
				imsi3 = Integer.parseInt(imsiStr);
				if(imsi3 < 0 || imsi3 > 100) {
					System.out.println("점수 입력 오류! 다시입력하세요!");
					break;
				}
			}else { // 숫자 아님
				System.out.println("올바른 수학점수가 아닙니다. 다시 입력 하세요!");
				break;
			}
			
			s = new Student(imsi,str1[1],imsi1,imsi2,imsi3);
			stu[cnt] = s;
			cnt++;
		}
		
		
		

		
		School sch = new School(stu,cnt);
		sch.rank();
		sch.ave();
		sch.sort();
		sch.print();
		
	}
}
