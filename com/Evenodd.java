package com;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		//12
		int no=sc.nextInt();
		if (no % 2 == 0)
		{
			System.out.println("no. is even" );

		} else {
			System.out.println("no." +no+" is odd");
		}
	}

}

