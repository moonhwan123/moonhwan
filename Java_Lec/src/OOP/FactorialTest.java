package OOP;

public class FactorialTest {

	public static void main(String[] args) {
		/*
		 -��� ȣ��
		 	: �޼��� ������ �ڱ��ڽ��� �ݺ������� ȣ��
		 	: ���ȣ���� �ݺ������� �ٲ� �� ������ �ݺ��� ���� ������ ����
		 	: �����ϱ� ����, ������ �ڵ��ۼ� ����
		 	
		 	�� ) ���丮��,����,Ʈ������,�������ǥ��
		 */
		
		
		
		
		//��������
		
		int x = 2;
		int n = 5;
		
		long result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += power(x,i);
		}
		System.out.println(result);
		
		//���丮��
		//5! = 1x2x3x4x5
		
		System.out.println(fact(5));
		

	}
	
	static long fact(int n) {
		long result = 0;
		
		if(n == 1)
			return 1;
		
		return n*fact(n-1);
	}
	
	
	
	static long power(int x,int n) {
		
		if(n ==1 )
			return x;
		
		return x*power(x,n-1);
	}

}
