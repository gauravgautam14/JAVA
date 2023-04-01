package com;

import java.util.Scanner;

public class Reversecount {
	public static void main(String[] args) {
		System.out.println("enter the value");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int gaurav = num; gaurav >= 0; gaurav--) {
			System.out.println(gaurav);
		}

	}
}
