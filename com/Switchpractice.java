package com;

import java.util.Scanner;

public class Switchpractice {
	public static void main(String[] args) {
		System.out.println("enter the character as folows :A,B,C,D");
		System.out.println("Enter any charcater value");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		switch (ch) {
		case 'A': {
		System.out.println("person name starts with a are bad");
			
		break;
		}
		case 'B': {
			System.out.println("person name starts with a are really bad");
				
			break;
			}
		case 'C': {
			System.out.println("person name starts with a are Average");
				
			break;
			}
		case 'D': {
			System.out.println("person name starts with a are non sense");
				
			break;
			}
		default :
		{
			System.out.println("invalid input");}
		
		}
		
	}

}
