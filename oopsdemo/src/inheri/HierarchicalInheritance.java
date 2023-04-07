  package inheri;
class Shape1{
	public void area() {
		System.out.println("display area");
	}
}
class Traingle extends Shape1 {
	public void area (int l,int h) {
		System.out.println(l*h);
	}
} 
class Circle extends Shape{
	public void area (int r) {
		System.out.println(3/4*r*r);
		System.out.println("hello gaurav");
	}
}
public class HierarchicalInheritance {
public static void main(String[] args) {
	Circle c1 =new Circle();
	c1.area(5);
}
}
