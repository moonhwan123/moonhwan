package exam;

import java.util.List;

import model.DataDAO;
import model.EmpVO;

public class Exam_03 {
	public static void main(String[] args) {
		
		DataDAO dao = new DataDAO();
		
		List<EmpVO> list = dao.exam_03();
		
		if(list.size()!=0) {
			System.out.print("이름\t월급\n");
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getEname()+"\t");
				System.out.print(list.get(x).getSalary()+"\n");
				
			}
		}else {
			System.out.println("자료가 없습니다.");
		}
		
		
		
		
		
	}
}
