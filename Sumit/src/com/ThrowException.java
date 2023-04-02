package com;

public class ThrowException {
	public static void main(String[] args) {
		int a, b, c;
		a = 100;
		b = 0;
		try {
			c = a / b;
		} catch (Exception f) {
//			 System.out.println(f);
//			 f.printStackTrace();
			System.out.println(f.toString());
			System.out.println(f.getMessage());
		}

		System.out.println("hello");
	}

}
