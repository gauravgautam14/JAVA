package encap;

interface Animals {
	int eyes = 2;

	void walk();

}

interface Herbivores {

}

class Horse1 implements Animals, Herbivores {
	public void walk() {
		System.out.println("walks on 4 legs");
	}
}

public class InterFaceEx {
	public static void main(String[] args) {
		Horse1 horse1 = new Horse1();
		horse1.walk();
	}
}
//multiple inheritance