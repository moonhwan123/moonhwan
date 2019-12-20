package OOP;

public class Cartest_mondai {

	public static void main(String[] args) {
		
		CAR2 K7 = new CAR2();
		CAR2 SONATA = new CAR2("HYUNDAI","white","SONATA","삼천만원","북대구 영업소");
		
		
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
		this("기아","블랙","K7","사천만원","동대구 영업소");
	}
	
	CAR2(String company,String color,String model, String nedan, String store){
		this.color = color;
		this.store = store;
		this.company = company;
		this.model = model;
		this.nedan = nedan;
	}
	
	void SHOW(){
		System.out.println("제조사 : "+this.company+", 색상 : "+this.color+", 모델명 : "+this.model+", 가격 : "+this.nedan+", 판매지점 : "+this.store);
	}
	
}