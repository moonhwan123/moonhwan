import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
리스트 words에는 여러 개의 영어 단어가 입력 되어 있다.
입력된 단어들 중에서 가장 길이가 긴 단어를 출력하는 프로그램을 작성
가장 긴 단어가 여러 개인 경우에는 모두 출력 한다.

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
		System.out.println("가장 긴 단어는 "+print);
		

	}

}
