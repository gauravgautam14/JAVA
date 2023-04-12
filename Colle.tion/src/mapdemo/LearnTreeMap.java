package mapdemo;
import java.util.Map;
import java.util.TreeMap;
//import java.util.TreeSet;

public class LearnTreeMap {
	public static void main(String[] args) {
		Map<String,Integer>num=new TreeMap<>();
		num.put("one", 1);
		num.put("two", 2);
		num.put("three", 3);
		num.put("four", 4);
	    num.put("one", 8);
		System.out.println(num);
		System.out.println(num.containsKey(3));
		System.out.println(num.isEmpty());
		System.out.println(num.remove(3));
	}
	}


