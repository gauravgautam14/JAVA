package march11;

public class FindDuplicateElement1 {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 4, 3, 2, 2, 1 };
		System.out.println("duplicate elements are :");
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.println(arr[j] + " ,");

				}
			}
		}
	}
}
