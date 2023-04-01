package ExceptionHandlingDemo;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException ae) {
			System.out.println("exception :" + ae);
		} finally {
			System.out.println("I am in finally block");
		}

	}
}
//finally is the block that is always executed wether exception is handled or not 