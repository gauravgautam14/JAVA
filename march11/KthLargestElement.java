package march11;

public class KthLargestElement {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 7, 9, 6 };
		int k = 4;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if (i == k - 1) {
				System.out.println(k + "largest element is " + a[i]);
				break;
			}
		}
		System.out.println("------------------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
