package Stringintro;

public class EqualsMethod {
	public static void main(String[] args) {
		String s1 = "gaurav";
		String s2 = "amit";
		String s3 = "GAURAV";
	System.out.println(s1.equals(s2));// false
		System.out.println(s1.equalsIgnoreCase(s3));//true
	}
}
