package ExceptionHandlingDemo;

public class RunTimeExceptionOrUnchecked {
	public static void main(String[] args) {
		int a = 100, b = 0, c;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("hello");

	}
}
//runtime exception or unchecked exception