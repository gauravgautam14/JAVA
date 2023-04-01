package practice;

import java.util.Scanner;

public class Palimdrone {
	public static void main(String[] args) {
		System.out.println("enter the value");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		int t = num;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;

			num = num / 10;
		}
		if (t == rev)
			System.out.println("palimdrone");
		else
			System.out.println("not palimdrone");
	}
}
