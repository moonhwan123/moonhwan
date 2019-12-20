package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

/*
[Iterator]
	-�÷��ǿ� ����� ��ҵ��� �о���� ����� ǥ��ȭ
	-����� �� ��ҿ� �����ϴ� ����� ���� Iterator�������̽� ����
	-Collection �������̽����� Iterator�� ��ȯ�ϴ� iterator()�� ����
	-Collection�� ���ǵ� �޼��� �̹Ƿ� List�� Set���� ����
 */

public class IteratorEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
//			System.out.println(it.next());
			System.out.println(obj);
		}

	}

}
