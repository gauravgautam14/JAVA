package accmodi;

class Account1 {
	public String name;
	protected String email;
	private String password;

	// getter and setter
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

public class PrivateAcess {
	public static void main(String[] args) {
		Account1 a = new Account1();
		a.name = "gaurav gautam";
		a.email = "gautamgaurav370@gmail.com";
		a.setPassword("gaurav123");
		System.out.println(a.getPassword());
		System.out.println(a.name);
		System.out.println(a.email);
	}
}
