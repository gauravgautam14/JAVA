package com;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		//5
		int fact=1;
		for(int i=1;i<=number;i++) {
			fact=fact*i; //1 =1*1;
			//2=1*2;
			//6=2*3
			
		}
		System.out.println(fact);
		
	}

}
