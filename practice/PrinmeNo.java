package practice;

import java.util.Scanner;

public class PrinmeNo {
public static void main(String[] args) {
	System.out.println("enter the value");
	Scanner sc = new Scanner(System.in);
	int no = sc.nextInt();
	int count=0;
	for(int i =1; i<=no;i++) {
		if(no%i==0) {
			count++;
		}
	}
	if(count>2) {
		System.out.println("not prime");
	}
	else if(no==0||no==1)
		System.out.println("prime not");
	else
		System.out.println("prime");
}
}
