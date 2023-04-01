package Stringintro;

public class CaseConsersionTypeConversion {
	public static void main(String[] args) {
		String name = "GAURAV GAUTAM";
		System.out.println(name.toUpperCase()); // case conversion
		System.out.println(name.toLowerCase()); // case conversion
		// ---------------------------------------------------------------
		int a = 10;
		int b = 20;
		System.out.println(a + b);// 30
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		System.out.println(s1 + s2);// 1020

		char[] c = name.toCharArray();
		System.out.println(c);

	}
}
