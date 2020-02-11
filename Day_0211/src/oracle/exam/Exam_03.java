package oracle.exam;

import java.util.Scanner;

/*
키보드로 부서번호 입력
부서번호에 해당하는 사원정보 출력
 */

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("부서번호 입력 >> ");
		int In_dno = sc.nextInt();
		
		OracleSQL oracle = new OracleSQL();
		
		try {
			oracle.makeConn();
			
			System.out.println(In_dno+"번 부서번호에 해당하는 인원들 입니다.");
			oracle.searchExam(In_dno);
			
			oracle.takeDown();
		} catch (Exception e) {
			
		}
		
		
		
		
	}
}
