import java.lang.reflect.Array;
import java.util.Arrays;

/*
[ArraysClass - �迭 ó�� Ŭ����]
 -> �迭���� , �׸� �� , ���� , �˻� ���� ���� �ϴ� Ŭ����

 */

public class Exam_08 {
	public static void main(String[] args) {

		int[] var = { 1, 2, 3, 4, 5, 6 };
		int[] str = Arrays.copyOf(var, var.length); // 7���� System.Arraycopy�� �޸� ������ ������ �Ҵ����� �ʾƵ� ���� , ���ϰ��� �迭

		System.out.println(Arrays.toString(str));

		System.out.println();
		System.out.println("�� �迭�� �ּҸ� �� - " + var.equals(str)); // var�� str�� �ּҰ��� �ٸ���.
		System.out.println("�� �迭�� ��Ұ��� �� - " + Arrays.equals(var, str)); // .equals() �� Arrays.equals()�� �ٸ���.

	}
}
