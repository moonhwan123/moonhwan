import java.util.Scanner;

/*
1.[�Է¿���]
10���� : 25
��ȯ : 2

2.[��¿���]
10���� : 25
2���� : 11001
 */
class ConvNumber{
	int dec;
	int conv;
	char str[] = {'0','1','2','3','4','5','6'
			,'7','8','9','A','B','C','D','E','F'}; 
	
	
	ConvNumber(){}
	ConvNumber(int dec, int conv){
		this.dec = dec;
		this.conv = conv;
	}
	
	String conversion(){
		int mok;
		int nmg;
		String binary = "";
		int temp = dec;
		do {
			mok = temp/conv;
			nmg = temp%conv; 
			binary = str[nmg]+binary; // ���ڿ� ���� �̿�
			temp = mok;	
		}while(mok!=0);
		return binary;
	}
	
}

public class Exam_03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("10���� : ");
		int dec = sc.nextInt();
		int conv =0;
		while(conv != 2 && conv != 8 && conv!= 16) {
			System.out.print("��ȯ�� ���� : ");
			conv = sc.nextInt();
		}
		

			

		
		ConvNumber conv1 = new ConvNumber(dec,conv);
		System.out.println("10 ���� : " + dec);
		System.out.println(conv+"���� : "+conv1.conversion());
		
	}

}
