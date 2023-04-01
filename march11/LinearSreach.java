package march11;

public class LinearSreach {

	public static void main(String[] args) {
		int[] arr = { 6, 34, 3, 6, 7, 2 };
		int item = 3;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				System.out.println("item is present at" + i + "index");

			}
		}
	}
}