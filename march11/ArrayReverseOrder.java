package march11;

import java.lang.reflect.Array;

public class ArrayReverseOrder {
	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
}
