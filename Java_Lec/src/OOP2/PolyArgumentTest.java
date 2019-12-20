package OOP2;

import java.util.Scanner;

class Product{
	int price;//��ǰ�� ����
	int bonusPoint;//��ǰ ���� �� �����ϴ� ���ʽ� ����
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
		//���ʽ� ������ ��ǰ ������ 10%
	}
}
class Tv1 extends Product{
	Tv1(){
		super(100);//Tv�� ������ 100����
	}
	public String toString() {
		return "TV";//Object Ŭ������ toString() �������̵�
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

class Buyer{//��,������ ��� ���
	int money = 1000;
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;
	
	void Buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;//���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;//��ǰ�� ���ʽ� ������ �߰�
		item[i++] = p;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	void summary() {//������ ��ǰ�� ���� ���� ���
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i<item.length;i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			itemList +=item[i]+", ";
		}

		System.out.println("�����Ͻ� ��ǰ�� �� �޾� "+sum+"���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"���Դϴ�.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("��ǰ�� ���ÿ�.");
		System.out.println("0. TV");
		System.out.println("1. COMPUTER");
		
		System.out.print("��ǰ ��ȣ : ");
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




















