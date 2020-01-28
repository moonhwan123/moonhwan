import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
[Scanner Class]



 */
public class Exam_03 {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(new File("c:\\data\\test.txt"));
		
//		String str = sc2.nextLine();
//		System.out.println(str);
		
		while(sc2.hasNext()) {
			String str2 = sc2.nextLine();
			System.out.println(str2);
		}
		
		
//      try {
//    	  Scanner scanner = new Scanner(new File("c:\\data\\test.txt"));
//    	  while(scanner.hasNextLine())
//    	  {
//    		  String line = scanner.nextLine();
//          
//          	System.out.println(line);
//    	  }
//	  } catch (FileNotFoundException e) {
//	      e.printStackTrace();
//	  }
		
		
	}
}
