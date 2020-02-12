package exam;

import java.util.List;

import model.DataDAO;
import model.EmpVO;

public class Exam_15 {
	public static void main(String[] args) {
		
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.exam_15();
		
		if(list.size()!=0) {
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getEname()+"\t");
				System.out.print(list.get(x).getSalary()+"\t");
				System.out.println(list.get(x).getCommission());

			}

		}else {
			System.out.println("자료가 없습니다.");
		}
		
		
		
		
		
		
		
	}
}
