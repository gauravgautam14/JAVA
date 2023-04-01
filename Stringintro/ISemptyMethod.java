package Stringintro;

public class ISemptyMethod {
public static void main(String[] args) {
	String name="";
	boolean b = name.isEmpty();
	if(b==true) {
		System.out.println("name is empty");
	}
	else 
		System.err.println("valid name");
}
}
