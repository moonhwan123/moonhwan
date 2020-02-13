package iostream;

import java.io.*;




public class Exam_02 {
	public static void main(String[] args) {

		File f = new File("c:\\data\\work");

		if (!f.exists()) {
			f.mkdir();
		}

		File f1 = new File(f, "filetest.txt");

		if (!f1.exists()) {
			try {
				f1.createNewFile();
			} catch (Exception e) {
				System.out.println("파일 생성 불가");
			}
		}

		
		
		
	}
}
