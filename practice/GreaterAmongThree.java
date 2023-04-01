package practice;

import java.util.Scanner;

public class GreaterAmongThree {
public static void main(String[] args) {
	System.out.println("enter the num1");
	Scanner sc = new Scanner(System.in);
	int num1 = sc.nextInt();
	System.out.println("enter the num2");
	int num2 = sc.nextInt();
	System.out.println("enter the num3");
	int num3 = sc.nextInt();
	
	if(num1>num2 && num1>num3)
	{
		System.out.println("num1 is greater ");
		
	}
	else if(num2>num1 && num2>num3) {
		System.out.println("num2 is greater");
	}
	else
		System.out.println("num3 is greater ");
	
}
}
