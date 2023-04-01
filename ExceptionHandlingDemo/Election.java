package ExceptionHandlingDemo;

import java.util.Scanner;

class YoungerAgeException1 extends RuntimeException {

	public YoungerAgeException1(String message) {
		super(message);
		// TODO Auto-generated constructor stu
	}
}

public class Election {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age");
		int age = s.nextInt();
		//try {

			if (age < 18)
			{
				throw new YoungerAgeException1("you are not eligible for voting");
			}
			else 
			{
				System.out.println("you can vote sucessfully");
			}
		//} catch (YoungerAgeException1 e) {
		//	e.printStackTrace();
		//}
		System.out.println("hello");
	}

}
