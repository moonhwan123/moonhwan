package exam2;

import model.DDLDao;

/*
DDL(데이터 정의어) : CREATE , ALTER , DROP
DML(데이터 조작어) : CRUD(INSERT,SELECT,UPDATE,DELETE)
DCL(데이터 제어어) : GRANT , REVOKE
TCL(트랜젝션 제어어) : COMMIT , ROLLBACK, SAVEPOINT

-INSERT INTO AAA(DNO,DNAME,REGDATE,SCORE)
	VALUES(10,'JOHN','20200212',90);
-INSERT INTO AAA VALUES(10,'JOHN','20200212',90); => 순서가 맞아야됨
 */
public class Exam_01 {
	public static void main(String[] args) {
		
		DDLDao dao = new DDLDao( );
		
//		dao.tableCreate();
		
		int dno = 30;
		String dname = "fuck";
		String date = "20200210";
		int score = 90;
		
		
		int row = dao.insertAAA(dno, dname, date, score);
		
		if(row == 0) {
			System.out.println("등록 실패");
		}else {
			System.out.println("등록 성공");
		}
		
		
		
		
		
	}
}
