package jslhrd;

public class DaoExam {

	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	// dbWork메서드의 매개변수 자리에 (DataAccessObject dao)를 쓴 이유를 알자
	// 바로 부모 클래스(정확히는 인터페이스 지만) 이기때문에 가능한것
	// 부모클래스는 자식클래스를 지목 할 수 있다.
	// 만약에 여기서 매개변수 자리에 구현한 클래스를 매개변수로 받았다면
	// 메서드가 2개 필요 했을 것이다.

	public static void main(String[] args) {

		dbWork(new OracleDao());
		dbWork(new MysqlDao());

	}

}

