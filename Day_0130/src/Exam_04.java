/*
[System 클래스]
- 운영체제와 상호작용 하는 경우 많이 사용

System.exit(); -> 프로세스 강제종료시
System.gc(); -> 가비지컬렉션 실행

 */



public class Exam_04 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		while(true) {
			System.out.println(cnt);
			if(cnt == 10) {
								//현재 실행중인 프로세스를 여기서 강제종료
				System.exit(1); //괄호안이 0 이면 "정상종료" , 0 이외의 값은 전부 "비정상 종료" 
			}
			cnt++;
		}
		
//		System.out.println("프로그램 종료");
		
//      System.gc(); 가비지 컬렉션 수행
		
		
	}
}
