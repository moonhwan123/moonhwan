package exam;

import java.util.ArrayList;
import java.util.List;

import model.DataDAO;
import model.EmpVO;

public class Exam_01 {
	public static void main(String[] args) {
		
		DataDAO dao = new DataDAO();
		
		List<EmpVO> list = dao.exam_01();
		
		if(list.size() != 0) {
			System.out.print("이름\t월급\t월급+300\n");
			for(int x = 0; x < list.size(); x++) {
				System.out.print(list.get(x).getEname()+"\t");
				System.out.print(list.get(x).getSalary()+"\t");
				System.out.println(list.get(x).getTemp());
			}
		}else {
			System.out.println("정보 없음");
		}
		
		
		
	}
}
