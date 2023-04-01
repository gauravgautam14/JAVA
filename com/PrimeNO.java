package com;

import java.util.Scanner;

public class PrimeNO {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count=0;
		//7
		for(int i =1;i<=number;i++ ) {
			if(number%i==0) {
				count++;
			}
			
			
		}
		if(count>2) {
			System.out.println("prime not");
			
		}
		else if(number==0||number==1)
			System.out.println("prime not");
		else
			System.out.println("prime");
	}
	
}
