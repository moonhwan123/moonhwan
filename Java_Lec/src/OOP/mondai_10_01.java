package OOP;

import java.util.Scanner;

class Song{
	String title;
	String artist;
	String country;
	int year;

	Song(){}
	Song(String t, String a, String c, int y){
		title = t;
		artist = a;
		country = c;
		year = y;
	}

	void show() {
		System.out.print(year + "년 ");
		System.out.print(country+"국적의 ");
		System.out.print(artist+"이 부른 ");
		System.out.print(title);
	}
}
	
class CALC{
	int num1;
	int num2;
	
	public CALC(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	int add() {
		return num1+num2;
	}
	int sub() {
		return num1-num2;
	}
	int mul() {
		return num1*num2;
	}
	int div() {
		return num1/num2;
	}
	
	
	
}
	


public class mondai_10_01 {
	

	public static void main(String[] args) {
		
		Song Q = new Song("Bohemian Rhapsody","Queen","Egland",1975);
		Q.show();
		System.out.println();
		
		
		System.out.println("계산기 시작 , 숫자입력");
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		
		CALC calc = new CALC(3,5);
		
		
		System.out.printf("%d + %d = %d \n",a,b,calc.add());
		System.out.printf("%d - %d = %d \n",a,b,calc.sub());
		System.out.printf("%d * %d = %d \n",a,b,calc.mul());
		System.out.printf("%d / %d = %d \n",a,b,calc.div());
		
		
	}

}
