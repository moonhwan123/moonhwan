import java.lang.reflect.Array;
import java.util.Arrays;

/*
[ArraysClass - 배열 처리 클래스]
 -> 배열복사 , 항목 비교 , 정렬 , 검색 등을 지원 하는 클레스

 */

public class Exam_08 {
	public static void main(String[] args) {

		int[] var = { 1, 2, 3, 4, 5, 6 };
		int[] str = Arrays.copyOf(var, var.length); // 7번의 System.Arraycopy와 달리 실제로 공간을 할당하지 않아도 가능 , 리턴값은 배열

		System.out.println(Arrays.toString(str));

		System.out.println();
		System.out.println("두 배열의 주소를 비교 - " + var.equals(str)); // var과 str의 주소값은 다르다.
		System.out.println("두 배열의 요소값을 비교 - " + Arrays.equals(var, str)); // .equals() 와 Arrays.equals()는 다르다.

	}
}
