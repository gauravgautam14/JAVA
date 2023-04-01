package Stringintro;

public class StringBufferMethodDEMO {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("gaurav java");
		StringBuffer sb2 = new StringBuffer("gaurav java");
		System.out.println(sb1.length());
		System.out.println(sb1.append("hlo"));
		System.out.println(sb1.charAt(3));
		System.out.println(sb1.delete(2, 5));
		System.out.println(sb1.deleteCharAt(3));
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.indexOf("a"));
		System.out.println(sb1.lastIndexOf("a"));
		System.out.println(sb1.insert(2, "o"));
		System.out.println(sb1.replace(3, 6, "g"));
		System.out.println(sb1.reverse());// it is not in String class
		System.out.println(sb1.subSequence(2, 5));
		System.out.println(sb1.substring(3));
		sb1.ensureCapacity(100);
		System.out.println(sb1.capacity());
		sb1.setCharAt(4, 'e');
		System.out.println(sb1);
		sb1.setLength(5);
		System.out.println(sb1);
		sb1.ensureCapacity(100);
		sb1.append("hello gautam");
		sb1.trimToSize();
		System.out.println(sb1.capacity());
	}
}
