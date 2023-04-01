package Stringintro;

public class ReplaceReplaceFirstReplaceAll {
	public static void main(String[] args) {
		String s1 = "harshita is a bihari";
		System.out.println(s1.replace("bihari", "gautam"));
		System.out.println(s1.replaceFirst("is", "was"));
		System.out.println(s1.replaceAll("is", "was"));
		System.out.println(s1.replaceAll("is(.*)", "was"));
	}
}

//thwas was done
//thwas is done
//thwas was done
//thwas
