package stackdemo;

import java.util.Stack;

public class LearnStack {
public static void main(String[] args) {
	Stack<String>animals=new Stack<>();
	animals.push("lion");
	animals.push("dog");
	animals.push("hourse");
	animals.push("cat");
	System.out.println("stack :"+animals);
	System.out.println(animals.peek());
	animals.pop();
	System.out.println("stack :"+animals);
	System.out.println(animals.peek());
}
}
