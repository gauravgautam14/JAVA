package com;

public class Inheritance {
public static void main(String[] args) {
	Lion l=new Lion();
	l.sleep();
	l.bark();
	l.eat();
	
}
}

class Dog{
	
	void sleep() {
		System.out.println("Sleeping");
	}
	
	void bark() {
		System.out.println("making sound");
	}
}
class cat extends Dog{
	
	void eat() {
		System.out.println("eating");
	}
	
}
class Lion extends cat{
	
	void m() {
		System.out.println("fshfgfhfbsf");
	}
}
