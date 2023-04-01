package march11;

public class FindDuplicateElement {
	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 2,1, 9, 5 ,5};
		int temp = 0;
		int i;
		int j;
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					temp = temp + 1;
					System.out.println("first duplicate element is " + a[j]);
				}
			}
			if(temp>0) {
				break;
			}
		}
	}
}
