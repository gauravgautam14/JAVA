package comm;

class Student {
	String name;
	int age;

	public void printInFo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class Oops {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "gaurav";
		s1.age = 21;
		s1.printInFo();
	}
}

