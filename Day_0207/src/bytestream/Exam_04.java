package bytestream;

import java.io.*;

public class Exam_04 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("c:\\data\\work\\data1.txt");
		
		FileInputStream fos = new FileInputStream(file);
		
		BufferedInputStream bos = new BufferedInputStream(fos);
		
		DataInputStream dos = new DataInputStream(bos);
		
		int a = dos.readInt();
		double b = dos.readDouble();
		byte[] bt = new byte[10];
		dos.read(bt);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("bt = " + new String(bt));
		
		
		
		
		
	}
}
