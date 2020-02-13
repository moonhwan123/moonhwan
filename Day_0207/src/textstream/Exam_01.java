package textstream;

import java.io.*;

/*
[텍스트 입출력]
Reader / Writer
InputStreamReader / OutputStreamWriter <-- 콘솔 입출력
FileReader / FileWriter                <-- 파일 입출력
BufferedReader / BufferedWriter
				 PrintWriter
				 

 */


public class Exam_01 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("c:\\data\\work\\data3.txt");
		
		//콘솔 출력
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		
		PrintWriter pw2 = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		pw.println("화면 출력 테스트 입니다.");
		
		pw.close();
		
		//파일 출력	
		PrintWriter pw3 = new PrintWriter(new BufferedWriter(new FileWriter(file)));
		
		pw3.println("파일 출력 테스트");
		pw3.close();
		
		
		
		
		
		
		
	}
}
