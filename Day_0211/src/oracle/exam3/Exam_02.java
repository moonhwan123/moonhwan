package oracle.exam3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oracle.dao.EmpDAO;
import oracle.dto.EmpVO;

/*
[Day_0212]
키보드 입력
부서번호(dno) 또는(or) 직급(업무명,job)이 같은 사원 정보 출력
 */
public class Exam_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		
		System.out.print("부서번호 입력 >> ");
		int dno = sc.nextInt();
		System.out.print("직급 입력 >> ");
		String job = sc.next().toUpperCase();
		
		List<EmpVO> list = new ArrayList<EmpVO>();
		
		list = dao.selectExam02(dno, job);
		
		if(list.size() != 0) {
			System.out.println("사번\t이름\t직급\t상사번호\t입사일\t\t\t월급\t커미션\t부서번호");
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getEno()+"\t"+list.get(x).getEname()+"\t"+list.get(x).getJob()+"\t");
				System.out.print(list.get(x).getManager()+"\t"+list.get(x).getHiredate()+"\t"+list.get(x).getSalary()+"\t");
				System.out.print(list.get(x).getCommission()+"\t"+list.get(x).getDno()+"\n");
			}
		}else {
			System.out.println("자료 없음");
		}
		
		
		
		
	}
}
