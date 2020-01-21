package jslhrd;

public class DaoExam {

	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	// dbWork�޼����� �Ű����� �ڸ��� (DataAccessObject dao)�� �� ������ ����
	// �ٷ� �θ� Ŭ����(��Ȯ���� �������̽� ����) �̱⶧���� �����Ѱ�
	// �θ�Ŭ������ �ڽ�Ŭ������ ���� �� �� �ִ�.
	// ���࿡ ���⼭ �Ű����� �ڸ��� ������ Ŭ������ �Ű������� �޾Ҵٸ�
	// �޼��尡 2�� �ʿ� ���� ���̴�.

	public static void main(String[] args) {

		dbWork(new OracleDao());
		dbWork(new MysqlDao());

	}

}
