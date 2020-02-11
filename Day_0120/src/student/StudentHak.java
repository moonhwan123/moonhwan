package student;

public class StudentHak extends Student {
	
	public StudentHak(int bun, String name, int[] jum) {
		super(bun, name, jum);
		for(int i = 0; i < jum.length; i++ ) {
			tot+=jum[i];
		}
		ave = (int)(tot/10.*100+0.5)/100.;

		
	}
	@Override
	public void account() {

		
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+ave);
	}
	@Override
	public void scoreBubble() {
		
		for(int i = 0; i < jum.length-1; i++ ) {
			for(int j = 0; j < jum.length-i-1; j++) {
				if(jum[j]<jum[j+1]) {
					int temp = jum[j];
					jum[j] = jum[j+1];
					jum[j+1] = temp;
				}
			}
		}
		System.out.println("[버블정렬]");
		for(int i = 0; i < jum.length; i++ ) {
			System.out.print(jum[i]+" ");
		}
		System.out.println();
		
	}
	@Override
	public void scoreMax() {
		int Max=jum[0];
		int Min=jum[0];
		for(int i = 1; i < jum.length; i++) {
			if(Max<jum[i]) Max = jum[i];
			if(Min>jum[i]) Min = jum[i];
		}
		System.out.println("최대 점수 : " + Max);
		System.out.println("최소 점수 : " + Min);
		
	}
	@Override
	public void scoreSelection() {
		
		for(int i = 0; i < jum.length-1; i++ ) {
			for(int j = i+1; j < jum.length; j++) {
				if(jum[i]>jum[j]) {
					int temp = jum[i];
					jum[i] = jum[j];
					jum[j] = temp;
				}
			}
		}
		System.out.println("[선택정렬]");
		for(int i = 0; i < jum.length; i++ ) {
			System.out.print(jum[i]+" ");
		}
		System.out.println();
		
	}
}
