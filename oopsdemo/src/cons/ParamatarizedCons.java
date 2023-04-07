package cons;
class Student1{
	String name;
	int age;
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student1(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("hyyy");
	}
}
public class ParamatarizedCons {
public static void main(String[] args) {
	Student1 s1=new Student1("gaurav",21);
	s1.printinfo();
}
}
