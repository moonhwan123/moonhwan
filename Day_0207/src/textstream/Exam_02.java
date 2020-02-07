package textstream;

import java.io.*;

public class Exam_02 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(new File("c:\\data\\work\\data2.txt")));
		
		String data = br.readLine();
		System.out.println(data);
		
		br.close();
		
		
	}
}
