package Stringintro;

public class ConcatjoinMethod {
	public static void main(String[] args) {
		String s1 = "deepak";
		String s2 = "java";
		System.out.println(s1.concat(s2));//deepakjava
		System.out.println(String.join(";", s1, s2)); //deepak;java
	}
}
