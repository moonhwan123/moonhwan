/*
[�޼ҵ� �����ε�]
- �޼ҵ� "�̸�"�� ��� "����" <-> ������ ����, "����"�� "Ÿ��" �� "�޶�"����

 */

class GG{
	void add (int a, int b) {
		int s = a+b;
		System.out.println("s = "+s);
	}
	void add (int ... a) { //�������� - �ڵ����� �迭 ó��( �Ű������� � ���� �𸦶�)
		int s = 0;
		for(int x = 0; x<a.length; x++) {
			s += a[x];
		}
		System.out.println("s = "+s);
	}
	void add2 (int[] arr) { //�迭
		int s = 0;
		for(int x= 0; x< arr.length; x++) {
			s += arr[x];
		}
		System.out.println("s = "+s);
	}
	
	
}


public class Exam_07 {
	public static void main(String[] args) {
		
		GG g1 = new GG();
		g1.add(10,20);
		g1.add(1,2,3,4,5); // �������� ������� ���� �迭�̾ƴ� �׳� �Ѱ���
		 
		int arr[] = {1,2,3,4,5}; 
		g1.add2(arr); // �迭 ������� ���� �迭�� ���·� �Ѱ���
		
		
		
	}
}
