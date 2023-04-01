package march11;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement3 {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 4, 3, 2, 2, 1, 3 };
		System.out.println("duplicate elements are :");
		Set<Integer> s = new HashSet<>();
		for (int no : arr) {
			boolean b = s.add(no);
			if (b == false) {
				System.out.println(no + " ");
			}
		}
	}
}
