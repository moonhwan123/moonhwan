package OOP2;

import java.util.Scanner;

class Product{
	int price;//제품의 가격
	int bonusPoint;//제품 구매 시 제공하는 보너스 점수
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
		//보너스 점수는 제품 가격의 10%
	}
}
class Tv1 extends Product{
	Tv1(){
		super(100);//Tv의 가격을 100만원
	}
	public String toString() {
		return "TV";//Object 클래스의 toString() 오버라이딩
	}
}

class Computer extends Product{
	public Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer{//고객,물건을 사는 사람
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	
	void Buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;//가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;//제품의 보너스 점수를 추가
		item[i++] = p;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	void summary() {//구매한 물품에 대한 정보 요약
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i<item.length;i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList +=item[i]+", ";
		}

		System.out.println("구입하신 물품의 총 급액 "+sum+"만원 입니다.");
		System.out.println("구입하신 제품은 "+itemList+"점입니다.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("상품을 고르시오.");
		System.out.println("0. TV");
		System.out.println("1. COMPUTER");
		
		System.out.print("상품 번호 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 0:
			b.Buy(new Tv1());
			break;

		case 1:
			b.Buy(new Computer());
			break;
		}
		b.summary();
		
		
//		b.Buy(new Tv1());
//		b.Buy(new Computer());
		
	}
}




















