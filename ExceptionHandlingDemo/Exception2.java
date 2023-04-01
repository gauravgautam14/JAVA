package ExceptionHandlingDemo;

class CheckAge extends RuntimeException {

	public CheckAge() {
		super("you are under age");
		// TODO Auto-generated constructor stub
	}

	public CheckAge(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

public class Exception2 {
	public static void main(String[] args) {
		int age = 36;
		try {
			if (age < 18) {
				throw new CheckAge("you cannot vote as your age is below 18");
			} else {
				System.out.println("you can vote now....");
			}
		} catch (CheckAge e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
//custom exception in runtime exception