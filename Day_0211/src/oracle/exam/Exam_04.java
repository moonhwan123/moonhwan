package oracle.exam;

import java.util.Scanner;

/*
키보드로 날짜입력 (예 : 1901-01-02)
'사원정보 테이블'에서 입력된 날짜 이후 입사한 사원 정보 출력 
  
  
  
 
 
 */


public class Exam_04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입사 날짜 입력 >> ");
		String In_hiredate= sc.next();	
		
		OracleSQL oracle = new OracleSQL();
		
		try {
			oracle.makeConn();
			
			oracle.searchExam02(In_hiredate);
			
			oracle.takeDown();
		} catch (Exception e) {
			
		}
		
		
		
		
		
	}
}
