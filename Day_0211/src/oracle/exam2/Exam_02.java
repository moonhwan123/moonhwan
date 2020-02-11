package oracle.exam2;

import java.util.List;

import oracle.dao.EmpDAO;
import oracle.dao.SawonDAO;
import oracle.dto.DeptVO;
import oracle.dto.EmpVO;

public class Exam_02 {
	public static void main(String[] args) {
		
		SawonDAO sdao = new SawonDAO();
		
		List<DeptVO> list = sdao.deptList();
		
		if(list.size()==0) {
			System.out.println("등록된 자료가 없음");
		}else {
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getDno()+"\t"+list.get(x).getDname()+"\t"+list.get(x).getLoc()+"\n");
			}
		}
		
		
		EmpDAO edao = new EmpDAO();
		
		List<EmpVO> list2 = edao.EmpList();
		
		if(list2.size()==0) {
			System.out.println("등록된 자료가 없음");
		}else {
			for(int x = 0; x < list2.size(); x++) {
				System.out.print(list2.get(x).getEno()+"\t"+list2.get(x).getEname()+"\t"+list2.get(x).getJob()+"\t");
				System.out.print(list2.get(x).getManager()+"\t"+list2.get(x).getHiredate()+"\t"+list2.get(x).getSalary()+"\t");
				System.out.print(list2.get(x).getCommission()+"\t"+list2.get(x).getDno()+"\n");
			}
		}
		
		
	}
}
