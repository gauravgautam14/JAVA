package march11;

public class OddEvenElementsInArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println("the even elements are :" + array[i]);
			} else if (array[i] % 2 != 0) {
				System.out.println("the odd elements are: " + array[i]);

			}
		}
	}

}
