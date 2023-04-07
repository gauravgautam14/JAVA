package cons;
class Student2{
	String name;
	int age;
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	Student2(Student2 s3){
		this.name=s3.name;
		this.age=s3.age;
	}
	Student2(){
		
	}
}
public class CopyCons {
public static void main(String[] args) {
	Student2 s2=new Student2();
	s2.name="sumit";
	s2.age=20;
	Student2 s3 =new Student2(s2);
			s2.printinfo();
}
}
