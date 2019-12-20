package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class FileReaderEx {
	public static void main(String[] args) throws IOException {
		
			FileReader fin = new FileReader("C:\\PT\\test.txt");
			int c;
			
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			
			fin.close();
		
	}
}
