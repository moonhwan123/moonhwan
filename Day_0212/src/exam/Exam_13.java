package exam;

import java.util.List;

import model.DataDAO;
import model.EmpVO;

public class Exam_13 {
	public static void main(String[] args) {
		
		
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.exam_13();
		
		if(list.size()!=0) {
			for(int x = 0; x < list.size(); x++) {
				System.out.println(list.get(x).getEname()+"\t");

			}

		}else {
			System.out.println("자료가 없습니다.");
		}
		
		
	}
}
