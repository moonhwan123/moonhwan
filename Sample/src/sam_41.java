
public class sam_41 {
	public static void main(String[] args) {
		
		int[] a = {1,3,5,7,9,11,13,15,17,19,21,23,25};
		int[] b = {2,4,6,8,10,12,14,16,18,20,22,24};
		int[] c = new int[25];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<=a.length-1 && j<=b.length-1) {
			if(a[i] <= b[j]) {
				c[k] = a[i];
				i++;
			}else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		
		if(i > a.length-1) {
			do {
				c[k] = b[j];
				k++;
				j++;
			}while(j <= b.length-1);
		}else {
			do {
				c[k] = a[i];
				k++;
				i++;
			}while(i <= a.length-1);
		}
		
		System.out.println("a[]");
		for(int x = 0; x < a.length; x++) {
			System.out.print(a[x]+" ");
		}System.out.println();
		
		System.out.println("b[]");
		for(int x = 0; x < b.length; x++) {
			System.out.print(b[x]+" ");
		}System.out.println();
		
		System.out.println("c[]");
		for(int x = 0; x < c.length; x++) {
			System.out.print(c[x]+" ");
		}
		
	}
}
