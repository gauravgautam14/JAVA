package march11;

import java.util.HashSet;

public class FisrtDuplicateElement2 {
	public static void main(String[] args) {
		int[] arr = { 6, 5, 3,  1, 2, 4 ,4};
		int temp = -1;
		HashSet<Integer> hs = new HashSet<>();
		for (int i = arr.length - 1; i >= 0; i--) {
			if (hs.contains(arr[i])) {
				temp = arr[i];
			} else {
				hs.add(arr[i]);
			}
		}
		if (temp != -1) {
			System.out.println("first duplicate element is " + temp);
		} else {
			System.out.println("first duplicate element not found");
		}
	}
}
