import java.util.Arrays;

/*
[ArraysŬ������ �̿��� 2���˻�]
 */

public class Exam_11 {
	public static void main(String[] args) {
		
		int var[] = {80,90,77,88,56,60,24};
		String name[] = {"ȫ�浿","��浿","�̱浿","�ڱ浿"};
		
		Arrays.sort(var);
		System.out.println(Arrays.toString(var));
		int index = Arrays.binarySearch(var, 90);
		System.out.println("90�� ��ġ "+index);
		
		System.out.println("--------------------------");
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("��浿");
		Member m3 = new Member("�̱浿");
		Member[] memArr = {m1,m2,m3};
		
		Arrays.sort(memArr);
		int index2 = Arrays.binarySearch(memArr, m3);
		System.out.println(m3.name+"��  "+index2+"��°");
		
		
	}
}
