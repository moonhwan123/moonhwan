package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
	public static void main(String[] args) throws IOException {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("c:\\PT\\test.txt");
			in = new InputStreamReader(fin);
			
			int c;
			
			
			while((c = in.read())!=-1) {
				System.out.print((char)c);
			}
			
			in.close();
			fin.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
