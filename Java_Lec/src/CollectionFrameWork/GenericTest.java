package CollectionFrameWork;

import java.util.Vector;

public class GenericTest {

	public static void main(String[] args) {
		
		
		/*
		[Generic]
			-컬렉션을 특정 타입에 맞게 형식화 해놓은 개념
			
			-제네릭 선언
				1.클래스의 선언부의 클래스명 뒤에 전달받은 타입의 수만큼 , 로 구분
				2.Generic Type은  꺽쇠(<>) 사이에 컴파일 할 당시 사용될 객체를 적어 놓으면, 객체 저장시 제네릭 타입으로 저장
				
			-API에서는 T,E,K,V 권장
				T : 전달되는 객체가 현 객체 내에서 자료형(Type)으로 쓰일때
				E : 전달되는 객체가 현 객체 내에서 요소(Element)로 쓰일때
				K : 전달되는 객체가 현 객체 내에서 키(Key)로 사용될때
				V : 전달되는 객체가 현 객체 내에서 값(Value)으로 사용될때
			
		 */

		
		
		Box box = new Box();
		box.set(new Integer(10));
		System.out.println("정수 : "+ box.get());
		
		BoxAll<Integer> ba = new BoxAll<Integer>();
		ba.set(new Integer(10));
		//ba.set("new"); -> 제네릭에서 Integer로 고정 시켰기 때문에 에러 발생함
		System.out.println("정수 : "+ ba.get());
		
		BoxAll<String> ba2 = new BoxAll<String>();
		ba2.set(new String("제네릭 클래스"));
		System.out.println("문자열 : "+ba2.get());
		
		
		
		
		
		
	}

}




class Box{
	private Integer i;
	
	public void set(Integer i) {
		this.i = i;
	}
	public Integer get() {
		return i;
	}
}

class BoxAll<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	
	
}









