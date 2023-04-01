package com;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the first number ");		
	int no1 = sc.nextInt();
	System.out.println("enter the second number ");
	int no2 = sc.nextInt();
	System.out.println("select the symbol (+,-,*,/)");
	String sym = sc.next();
	int res;
	switch(sym)
{
	case"+": res= no1+no2;
	System.out.println("addition is :"+ res);
	break;
	case "-": res=no1-no2;
	System.out.println("substrartion is"+ res);
	break;
	case "*": res=no1*no2;
	System.out.println("miltiply is "+ res);
	break;
	case "/": res=no1/no2;
		System.out.println("divion is "+ res);
	break;
	default :
		System.out.println("invalid symbol");  
break;

		
	}
}
}
