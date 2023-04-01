package march11;

public class SearchMin {
	public static void main(String[] args) {
		int[] arr = { 9, 6, 4, 3, 1, 5 };
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("min element is " + min);
	}

}
