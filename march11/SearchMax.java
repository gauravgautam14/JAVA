package march11;

public class SearchMax {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 4, 8, 9 ,80};
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];

			}
		}
		System.out.println("max element is " + max);
	}
}
