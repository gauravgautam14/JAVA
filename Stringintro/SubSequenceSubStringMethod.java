package Stringintro;

public class SubSequenceSubStringMethod {
	public static void main(String[] args) {
		String s1 = "this is done";
		System.out.println(s1.subSequence(3, 9));// s is d
		System.out.println(s1.substring(3));// s is done
		System.out.println(s1.substring(3, 11));// s is don
		System.out.println(s1.substring(0, 0));
	}
}
