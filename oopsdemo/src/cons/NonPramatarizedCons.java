package cons;

class Student {
	String name;
	int age;

	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}

	Student() {
		System.out.println("constructor called");
	}
}

public class NonPramatarizedCons {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "gaurav";
		s.age = 22;
		s.printinfo();
	}
}
