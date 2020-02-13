package student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class test2222 {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File("c:\\data\\test1.txt"));
		Scanner sc2 = new Scanner(System.in);
		
		String[] arr= new String[20]; // 정답 받아오기용
		Student stu = null;
		String[] str = null;

		
		
		
		
		while(sc.hasNext()) {
			str = sc.nextLine().split(",");
			System.out.println(Arrays.toString(str));

		}
		for(int x = 0; x < arr.length; x++) {
			arr[x] = str[x+2];
		}
		
		System.out.println(Arrays.toString(str));
		System.out.println(str.length);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
