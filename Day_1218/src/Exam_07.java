/*
[Bit(Binary Digit)]
-컴퓨터의 최소단위 (0,1)
-1bit는 0,1 두가지를 표시 할 수 있다.
-n개의 bit가 있다면 2의n승 개 만들수 있다.
-그중 최대값 2의n승 -1
-1Byte => 1문자 , 8bit, 2의8승 (256가지,255)

[bit -> byte -> word]
-half word 방식 : 16bit
-full word 방식 : 32bit
-double word 방식 : 64bit


[비트연산자]
<< , >>, &(and) , |(or), ^(xor), ~(보수,not,단항연산자)
 
- << , >> : 비트 이동 연산자 , x << n = x * 2^n , x >> n = x / 2^n

 */

public class Exam_07 {
	
	public static void main(String[] args) {
		
		//10 << 2 - 10을 왼쪽으로 2칸 옮겨라
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
