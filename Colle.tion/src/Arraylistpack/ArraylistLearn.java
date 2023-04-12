package Arraylistpack;

import java.util.ArrayList;
import java.util.List;

public class ArraylistLearn {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(1,10);
System.out.println(list);
System.out.println(list.get(3));
list.remove(1);

System.out.println(list);
list.clear();
System.out.println(list);
//list.set(0, 10);
System.out.println(list);
System.out.println(list.contains(20));//
}
}
