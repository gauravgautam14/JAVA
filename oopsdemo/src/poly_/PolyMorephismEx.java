package poly_;
class Student{
	String name;
	int age;
	//FUNCTION OVERLOADING
	public void printinfo(String name) {
		System.out.println(name);
	}
	public void printinfo(String name,int age) {
		System.out.println(name+"  "+ age);
	}
	public void printinfo(int age) {
		System.out.println(age);
	}
}
public class PolyMorephismEx {
public static void main(String[] args) {
	Student s=new Student();
	s.name="gautam";
	s.age=23;
	//s.printinfo(s.age);
	s.printinfo(s.name,s.age);
//	s.printinfo(s.name);
}
}
