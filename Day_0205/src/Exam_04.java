import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
����Ʈ voca���� �� ���� ���� �ܾ ���� �Ǿ� �ִ�. (�ߺ��� �ܾ�� ����)
�� �ܾ voca�� �� �� ����Ǿ� �ִ� ���� ����ϴ� ���α׷��� �ۼ�
(�ݵ�� ����(Map)�� �̿��Ѵ�.)

voca = ['rose','candle','paper,'book','song','candle','berry','paper',
'berry','song','paper','rose','song','lion','berry','book','rose']

[���]
candle : 2 times
rose : 5 times
song : 3 times
.
.
.

 */

public class Exam_04 {
	public static void main(String[] args) {
		
		List<String> wordList = new ArrayList<String>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		wordList.add("rose");wordList.add("candle");wordList.add("paper");wordList.add("book");
		wordList.add("song");wordList.add("candle");wordList.add("berry");wordList.add("paper");
		wordList.add("berry");wordList.add("song");wordList.add("paper");wordList.add("rose");
		wordList.add("song");wordList.add("lion");wordList.add("berry");wordList.add("book");wordList.add("rose");

		int cnt = 0;
		System.out.println(wordList);
		Collections.sort(wordList);
		for(int x = 0 ; x < wordList.size(); x++) {
			String s = wordList.get(x);
			
			if(map.containsKey(s)) {
				cnt++;
				
			}else {
				cnt=1;
			}
			map.put(s, cnt);
		
		}
		
		
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			String x = (String)iter.next();
			System.out.println(x+" : "+map.get(x)+" times");
		}
		

		
	}
}
