package exam2;

import model.DDLDao;

/*
delete from 테이블 where 조건식


 */

public class Exam_03 {
	public static void main(String[] args) {
		int dno = 10;
		
		DDLDao dao = new DDLDao();
		
		int row = dao.aaaDelete(dno);
		
		if(row == 0) {
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
		
		
		
		
	}
}
