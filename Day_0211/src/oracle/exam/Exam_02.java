package oracle.exam;

import java.util.Scanner;

/*
키보드로 부서코드를 입력 받아서 
부서코드에 해당하는 부서출력 
 */

public class Exam_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("부서코드 입력 >> ");
//		int idno = sc.nextInt();
		
		OracleSQL oracle = new OracleSQL();
		
//		try {
//			oracle.makeConn();
//			oracle.deptSearch(idno);
//			oracle.takeDown();
//		} catch (Exception e) {
//			
//		}
		
		System.out.print("찾을 이름 검색 >> ");
		String i_ename = sc.next();
		
		try {
			oracle.makeConn();
			oracle.nameSearch(i_ename);
			oracle.takeDown();
		} catch (Exception e) {
			
		}
		
		
		
		
		
	}
}
