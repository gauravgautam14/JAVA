package com;

import java.util.Scanner;

public class GivenInputDigitOrNot {
	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(Character.isDigit(a)){
			System.out.println("is a digit");
		}
		else
			System.out.println("not a digit");
		
	}

}
