package march11;

public class LinearSreachString {
	public static void main(String[] args) {
		String[] arr = { "deepak", "ravi", "gairav", "sumit", "parveen" };
		String item = "sumit";
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(item)) {
				System.out.println("items present in " + i + " index ");
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println("item not present in the list");
		}
	}
}
