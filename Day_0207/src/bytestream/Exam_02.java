package bytestream;

import java.io.*;

public class Exam_02 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("c:\\data\\work\\data.txt");
		
//		// 키보드 입력 
//		FileInputStream fi = new FileInputStream(FileDescriptor.in);
//		
//		System.out.print("입력 : ");
//		try {
//			int b = fi.read();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		FileInputStream fis = new FileInputStream(file);
		
		byte[] by = new byte[100];
		int count = fis.read(by);
		
		for(int i = 0 ; i < count; i++) {
			System.out.println(i + " : " + (char)by[i]);
		}
		
		
		
		
		
		
		
	}
}
