package textstream;

import java.io.*;

/*
[�ؽ�Ʈ �����]
Reader / Writer
InputStreamReader / OutputStreamWriter <-- �ܼ� �����
FileReader / FileWriter                <-- ���� �����
BufferedReader / BufferedWriter
				 PrintWriter
				 

 */


public class Exam_01 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("c:\\data\\work\\data3.txt");
		
		//�ܼ� ���
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		
		PrintWriter pw2 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		pw.println("ȭ�� ��� �׽�Ʈ �Դϴ�.");
		
		pw.close();
		
		//���� ���	
		PrintWriter pw3 = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		
		pw3.println("���� ��� �׽�Ʈ");
		pw3.close();
		
		
		
		
		
		
		
	}
}
