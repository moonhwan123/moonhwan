/*
[SystemŬ������ ���� �迭 ����]
System.arraycopy(�����迭,������ġ,���迭,������ġ,�׸��);
�ּҰ� �ƴ� ���� �����Ѵ�.
�� �迭�� ���絵 ����
 */
public class Exam_06 {
	public static void main(String[] args) {
		
		char[] arr1 = {'��','��','��','��'};
		
		char[] arr2 = {'a','b','c','d','e','f'};
		
		System.out.println("[���� �迭 ���]");
		System.out.print("arr1 : ");
		for(char ch : arr1) {
			System.out.print(ch + "\t");
		}
		System.out.println();
		System.out.print("arr2 : ");
		for(char ch : arr2) {
			System.out.print(ch + "\t");
		}
		System.out.println();
		
		// �迭 ���� 
		System.arraycopy(arr1, 0, arr2, 2, 4); // �ּҰ� �ƴ� ���� �����ϰ� �ִ�.
		
		System.out.println("[���纻 �迭 ���]");
		System.out.print("arr2 : ");
		for(char ch : arr2) {
			System.out.print(ch + "\t");
		}
		
	}
}
