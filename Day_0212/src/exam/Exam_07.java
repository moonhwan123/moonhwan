package exam;

import java.util.List;

import model.DataDAO;
import model.EmpVO;

public class Exam_07 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		List<EmpVO> list = dao.exam_07();
		
		if(list.size()!=0) {
			System.out.println("이름\t부서번호");
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getEname()+"\t");
				System.out.print(list.get(x).getDno()+"\n");
			}
		}else {
			System.out.println("자료가 없습니다.");
		}
		
		
	}
}
