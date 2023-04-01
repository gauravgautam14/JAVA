package com;

import java.util.Scanner;

public class CharacterCheck {
public static void main(String[] args) {
	System.out.println("Enter the chaarcter");
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
		System.out.println("vowel");
	}
	else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		System.out.println("consonant");
	else
		System.out.println("invalid input");
}

	
}
