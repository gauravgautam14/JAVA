package com;

import java.util.Scanner;

public class Factorial1 {
public static void main(String[] args) {
	System.out.println("enter the value");
	Scanner sc = new Scanner(System.in);
	int no= sc.nextInt();
	int fact=1;
	for(int i=1;i<=no;i++) {
		fact=fact*i;
	}
	System.out.println(fact);
}
}
 