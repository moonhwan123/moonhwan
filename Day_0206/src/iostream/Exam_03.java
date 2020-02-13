package iostream;

import java.io.*;

public class Exam_03 {
	public static void main(String[] args) {
		
		File f = new File("c:\\data\\work\\filetest.txt");
		
		if(f.exists()) {
			f.deleteOnExit(); // 프로그램 종료시 삭제
			System.out.println("파일명 : " + f.getName());
			System.out.println("파일경로 : " + f.getPath());
			System.out.println("파일경로 : " + f.getParent());
			System.out.println("파일크기 : " + f.length()+"kb");
			System.out.println("파일 최종 수정일 : " + f.lastModified());
		}else {
			System.out.println(f.getName() + "라는 파일은 존재 하지 않습니다.");
		}
		
		                                                   
		
		
		
	}
}
