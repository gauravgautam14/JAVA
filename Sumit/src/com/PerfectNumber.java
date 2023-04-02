package com;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("enter the value ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("the sum of all factor \n" + sum);
		if (n == sum) {
			System.out.println("perfect number");
		} else
			System.out.println("not perfect number");
	}
}
