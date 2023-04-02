package com;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int result;
		System.out.println("Enter the value of a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the value of b");
		int b=sc.nextInt();
		System.out.println("enter the operator :*,+,-,/");
		String op=sc.next();
		switch(op)
		{
		
		case "+":
			result=a+b;
			System.out.println(result);
			break;
		case "-":
			result=a-b;
			System.out.println(result);
			break;
		case "/":
			result=a/b;
			System.out.println(result);
		case "*":
			result=a*b;
			System.out.println(result);
		default:
			System.out.println("invalid operator");
			
		}
	}

}
