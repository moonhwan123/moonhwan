import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
����Ʈ words���� ���� ���� ���� �ܾ �Է� �Ǿ� �ִ�.
�Էµ� �ܾ�� �߿��� ���� ���̰� �� �ܾ ����ϴ� ���α׷��� �ۼ�
���� �� �ܾ ���� ���� ��쿡�� ��� ��� �Ѵ�.

words = ['hello','tall','banana','hi','key']
ouput = banana
 */
public class Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> wordList = new ArrayList<String>();
		List<String> print = new ArrayList<String>();
		
		wordList.add("hello");wordList.add("tall");wordList.add("banana");
		wordList.add("hi");wordList.add("key");wordList.add("phone");
		wordList.add("panana");
		
		int longest = 0;
		
		for(int x = 1 ; x < wordList.size(); x++) {
			if(wordList.get(longest).length() <= wordList.get(x).length()) {
				longest = x;
				print.add(wordList.get(longest));
			}
		}
		System.out.println(wordList);
		System.out.println("���� �� �ܾ�� "+print);
		

	}

}
