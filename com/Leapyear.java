package com;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		System.out.println("enter the value");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))

		{
			System.out.println(year + "is leap year");

		} else {
			System.out.println("not a leap year");
		}

	}

}
