package Arraylistpack;

import java.util.ArrayList;

public class LearnArrayList {
public static void main(String[] args) {
	ArrayList<String>studentname=new ArrayList<>();
	studentname.add("gaurav");
	studentname.add("sumit");
	System.out.println(studentname);
	studentname.remove("sumit");
	System.out.println(studentname);
	studentname.add("sinu");
	studentname.add("monu");
	System.out.println(studentname);
	studentname.clear();
	System.out.println(studentname);

}
}
