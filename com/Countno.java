package com;

import java.util.Scanner;

public class Countno {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
	}
}
