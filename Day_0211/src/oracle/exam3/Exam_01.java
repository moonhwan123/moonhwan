package oracle.exam3;
/*
[Day_0212]
키보드로 부서번호, 직급을 입력(AND 연산자)
해당사원 정보 출력
 */

import java.util.Scanner;

import oracle.dao.EmpDAO;
import oracle.dto.EmpVO;

public class Exam_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		
		System.out.print("부서번호 입력 >> ");
		int dno = sc.nextInt();
		System.out.print("직급 입력 >> ");
		String job = sc.next();
		
		EmpVO vo = dao.selectEmp(dno,job);
		
		
		if(vo.getEno() != 0) { //null은 이경우에는 안되는게, 메서드 만들때 객체 초기화 값을 null이 아니라 첨부터 new로 만들어버려서 그렇다.
			System.out.println("사번\t이름\t직급\t상사번호\t입사일\t\t\t월급\t커미션\t부서번호");
			System.out.print(vo.getEno()+"\t"+vo.getEname()+"\t"+vo.getJob()+"\t");
			System.out.print(vo.getManager()+"\t"+vo.getHiredate()+"\t"+vo.getSalary()+"\t");
			System.out.println(vo.getCommission()+"\t"+vo.getDno());
		}else {
			System.out.println("자료가 없습니다.");
		}
		
		
	}
	
}
