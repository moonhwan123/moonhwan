package OOP;

public class Cartest_mondai {

	public static void main(String[] args) {
		
		CAR2 K7 = new CAR2();
		CAR2 SONATA = new CAR2("HYUNDAI","white","SONATA","��õ����","�ϴ뱸 ������");
		
		
		K7.SHOW();
		SONATA.SHOW();

	}

}

class CAR2{
	final String store;
	String company;
	String color;
	String model;
	String nedan;
	
	CAR2(){
		this("���","��","K7","��õ����","���뱸 ������");
	}
	
	CAR2(String company,String color,String model, String nedan, String store){
		this.color = color;
		this.store = store;
		this.company = company;
		this.model = model;
		this.nedan = nedan;
	}
	
	void SHOW(){
		System.out.println("������ : "+this.company+", ���� : "+this.color+", �𵨸� : "+this.model+", ���� : "+this.nedan+", �Ǹ����� : "+this.store);
	}
	
}