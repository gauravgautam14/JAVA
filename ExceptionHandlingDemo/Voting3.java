package ExceptionHandlingDemo;

 class UnderAgeException extends Exception {

	public UnderAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnderAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}

class Voting3 {

	public static void main(String[] args) {
		int age = 17;
		try {
			if (age < 18)
				throw new UnderAgeException();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}