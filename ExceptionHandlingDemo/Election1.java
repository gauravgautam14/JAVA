package ExceptionHandlingDemo;

class uderageexception extends Exception {
	uderageexception() {
		super("you are under age");
	}

	public uderageexception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

public class Election1 {
	public static void main(String[] args) {
		int age = 17;
		try {
			if (age < 18) {
				throw new uderageexception("vote nhi kr skta");
			}
			else
			{
				System.out.println("you can vote");
			}
		} catch (uderageexception e) {
			e.printStackTrace();
		}

	}
}
//checked custom exception