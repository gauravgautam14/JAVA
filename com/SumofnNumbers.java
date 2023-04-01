package com;

import java.util.Scanner;

public class SumofnNumbers {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++) {
			sum=sum+i;
			//1+2+3+4+5=15
		}
		System.out.println(sum);
	}

}
