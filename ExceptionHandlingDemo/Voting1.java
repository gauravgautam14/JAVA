package ExceptionHandlingDemo;

import java.util.Scanner;

class YoungerAge extends RuntimeException {

	YoungerAge(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
}
class Voting1 {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age < 18) 
		{
			throw new YoungerAge(" jvajHXJHBAJHSXGHSA");
		}
		else
		{
			System.out.println("you can vote sucessfully");
		}
	}
	}
