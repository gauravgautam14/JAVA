package comm;

class Pen {
	String colour;
	String type;

	public void write() {
		System.out.println(this.colour);
	}

}

public class ClsAndObjts {
	public static void main(String[] args) {
		Pen pen1 = new Pen();
		pen1.colour = "blue";
		pen1.type = "gel";
		Pen pen2 = new Pen();
		pen2.colour = "black";
		pen2.type = "ballpoint";
		pen1.write();
		pen2.write();
	}
}
