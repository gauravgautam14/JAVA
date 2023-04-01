package march11;

import java.util.Scanner;

public class NoOfVowelsConsonant {
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int vowel = 0;
		int consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'a' || str.charAt(i) == 'u'
					|| str.charAt(i) == 'e' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'A'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'E') {
				vowel++;
			} else {
				consonant++;
			}
		}
		System.out.println("number of consonant = " + consonant);
		System.out.println("number of vowels = " + vowel);
	}
}
