/*
[Bit(Binary Digit)]
-��ǻ���� �ּҴ��� (0,1)
-1bit�� 0,1 �ΰ����� ǥ�� �� �� �ִ�.
-n���� bit�� �ִٸ� 2��n�� �� ����� �ִ�.
-���� �ִ밪 2��n�� -1
-1Byte => 1���� , 8bit, 2��8�� (256����,255)

[bit -> byte -> word]
-half word ��� : 16bit
-full word ��� : 32bit
-double word ��� : 64bit


[��Ʈ������]
<< , >>, &(and) , |(or), ^(xor), ~(����,not,���׿�����)
 
- << , >> : ��Ʈ �̵� ������ , x << n = x * 2^n , x >> n = x / 2^n

 */

public class Exam_07 {
	
	public static void main(String[] args) {
		
		//10 << 2 - 10�� �������� 2ĭ �Űܶ�
		//10 >> 2
		//10 & 4 , 10 | 5 , 10 ^ 5 , ~10
		//byte(1), char(2) ,int(4) -> 1byte == 8bit => bit(0,1)
		
		System.out.println("10 << 1 = " + (10<<1));
		System.out.println("10 << 2 = " + (10<<2));
		System.out.println("10 << 3 = " + (10<<3));
		System.out.println();
		System.out.println("10 >> 1 = " + (10>>1));
		System.out.println("10 >> 2 = " + (10>>2));
		System.out.println("10 >> 3 = " + (10>>3));
		
	}

}
