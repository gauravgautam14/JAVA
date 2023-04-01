package Stringintro;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("gaurav");
		System.out.println(sb.capacity());// 16+string length=22
		sb.append("gautam");
		System.out.println(sb.capacity());// 22
		sb.append("sher ajay gautam");
		System.out.println(sb.capacity());// 46

	}
}
