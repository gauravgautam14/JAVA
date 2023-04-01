package march11;

public class ArrayOddSum {
	public static void main(String[] args) {
		int sum = 0;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);
				sum = sum + arr[i];
			}
			//System.out.println(" the sum of above odd elements and sum of above all odd elements are :" + sum);
		}
		System.out.println(" the sum of above odd elements and sum of above all odd elements are :" + sum);
	}
}
