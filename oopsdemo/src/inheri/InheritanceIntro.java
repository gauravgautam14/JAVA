package inheri;
class Shape{
	public void area() {
		System.out.println("display area");
	}
}
//single inheritance
class Triangle extends Shape{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
		System.out.println("gaurav gautam");
	}
}
//multilevel inheritance 
class EquilateralTriangle extends Triangle{
	public void area(int l,int h) {
		System.out.println(1/2*l*h);
	}
}
public class InheritanceIntro {
public static void main(String[] args) {
	Triangle t1=new Triangle();
	t1.area(10,20);
}}