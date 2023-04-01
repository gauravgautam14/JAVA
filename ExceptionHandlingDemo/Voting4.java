package ExceptionHandlingDemo;

class UnderAgeException extends RuntimeException {
	UnderAgeException() {
		super("you are under age");
	}

	UnderAgeException(String msg) {
		super(msg);
	}
}

public class Voting4 {
	public static void main(String[] args) {
		int age = 16;
		try {
			if (age < 18) {
				throw new UnderAgeException("you cannot vote as your age below 18");
			} else {
				System.out.println("you can vote now.....");
			}
		} catch (UnderAgeException e) {
			e.printStackTrace();
		}
	}
}
