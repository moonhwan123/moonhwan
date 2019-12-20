package CollectionFrameWork;

import java.util.Vector;

public class GenericTest {

	public static void main(String[] args) {
		
		
		/*
		[Generic]
			-�÷����� Ư�� Ÿ�Կ� �°� ����ȭ �س��� ����
			
			-���׸� ����
				1.Ŭ������ ������� Ŭ������ �ڿ� ���޹��� Ÿ���� ����ŭ , �� ����
				2.Generic Type��  ����(<>) ���̿� ������ �� ��� ���� ��ü�� ���� ������, ��ü ����� ���׸� Ÿ������ ����
				
			-API������ T,E,K,V ����
				T : ���޵Ǵ� ��ü�� �� ��ü ������ �ڷ���(Type)���� ���϶�
				E : ���޵Ǵ� ��ü�� �� ��ü ������ ���(Element)�� ���϶�
				K : ���޵Ǵ� ��ü�� �� ��ü ������ Ű(Key)�� ���ɶ�
				V : ���޵Ǵ� ��ü�� �� ��ü ������ ��(Value)���� ���ɶ�
			
		 */

		
		
		Box box = new Box();
		box.set(new Integer(10));
		System.out.println("���� : "+ box.get());
		
		BoxAll<Integer> ba = new BoxAll<Integer>();
		ba.set(new Integer(10));
		//ba.set("new"); -> ���׸����� Integer�� ���� ���ױ� ������ ���� �߻���
		System.out.println("���� : "+ ba.get());
		
		BoxAll<String> ba2 = new BoxAll<String>();
		ba2.set(new String("���׸� Ŭ����"));
		System.out.println("���ڿ� : "+ba2.get());
		
		
		
		
		
		
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









