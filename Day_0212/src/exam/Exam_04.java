package exam;

import model.DataDAO;
import model.EmpVO;

public class Exam_04 {
	public static void main(String[] args) {
		DataDAO dao = new DataDAO();
		
		EmpVO vo = dao.exam_04();
		
		if(vo.getEname()!=null) {
			System.out.println("이름\t봉급");
			System.out.print(vo.getEname()+"\t"+vo.getDno()+"\n");
		}else {
			System.out.println("값 없다.");
		}
		
		
	}
}
