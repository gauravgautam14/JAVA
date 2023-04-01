package practice;

import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		System.out.println("enter the string ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = " ";
		for (int i = str.length() -1; i >= 0; i--) 
		{
			rev = rev + str.charAt(i);

		}
		System.out.println("reverse of is" + rev);

	}
}
