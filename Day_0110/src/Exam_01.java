/*
�޼ҵ� - ������ �ɺθ���
[�޼ҵ� ����] 
����������   ����Ÿ��   �޼ҵ��(�Ű�����){
	���⼭ ����۾�
}

���������� - ���� �ɺθ��� ��Ű�°� �޼ҵ带 ȣ���Ҽ� �ִ� ���� ����
		- public / private
		- �ƹ��͵� �Ⱦ� : ������ ����
		
����Ÿ�� - �����

 */

/*
1. �޼ҵ�(�Լ�) ����

 */


public class Exam_01 {
	
	// 1. ���� Ÿ��x(void), �Ű�����x(��ȣ�ȿ� �ƹ��͵�x)
	static void printA() {
		System.out.println("Method test");
	}
	//�̷��� ���� �޼ҵ�� �ٸ� �޼ҵ� �Ǵ� �ڱ��ڽ��� ȣ�� �Ѵ�.
	
	
	public static void main(String[] args) {
		//                    �ڷ���       ����
		// main�޼ҵ� 
		// void -> ���� Ÿ�� ����
		
		System.out.println("Method Call test Start");
		printA();
		System.out.println("Method Call test End");
		
		
		
	}
}
