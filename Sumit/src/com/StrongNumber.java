package com;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {

		int sum = 0;
		System.out.println("Enter the number");// 143
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		while (n != 0) {
			int remainder = n % 10;
			int fact = 1;
			for (int i = 1; i <= remainder; i++) {

				fact = fact * i;
				System.out.println(fact);
			}
			sum = sum + fact;
			n = n / 10;

		}
		if (sum == temp) {
			System.out.println("strong");
		} else
			System.out.println("not strong");
	}
}