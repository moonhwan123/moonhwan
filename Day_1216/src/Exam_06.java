/*
   번호	이름		점수
  01	홍길동	90
 */

public class Exam_06 {
	
	public static void main(String[] args) {
		
		System.out.print("번호\t이름\t점수\n");
		System.out.print("01\t");
		System.out.print("홍길동\t");
		System.out.print(90+"\n");
		System.out.println();
		System.out.println("[형식지정출력]");
		System.out.printf("%10s",123); // 형식지정 출력
		
		System.out.println();
		
		System.out.printf("10을 10진수로 = %d\n",10); //%d : 10진수
		System.out.printf("10을 8진수로 = %o\n",10); //%o : 8진수
		System.out.printf("10을 16진수로 = %x\n",10); //%x : 16진수
		
		
		
	}

}
