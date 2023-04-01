package ExceptionHandlingDemo;

public class MethodToFindException {
	public static void main(String[] args) {
		try {
			int a = 100, b = 0, c;
			c = a / b;
			System.out.println(c);
		} 
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();                  //exception name and discription and stack trace
			//System.out.println(ae);                  //exception name and discription
			//System.out.println(ae.toString());     //exception name and discription
			//System.out.println(ae.getMessage());     // only give discription
		}
	}
}
