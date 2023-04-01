package practice;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int length = 0;
		int t1 = num;
		int arm = 0;
		int t2 = num;
		while (t1 != 0) {
			length = length + 1;
			t1 = t1 / 10;
		}
		while (t2 != 0) {
			int rem = t2 % 10;
			int mul = 1;

			for (int i = 1; i <= length; i++) {
				mul = mul * rem;

			}

			arm = arm + mul;
			t2 = t2 / 10;

		}
		if (num == arm) {
			System.out.println("armstrong");
		} else
			System.out.println("not armstrong");
	}
}
