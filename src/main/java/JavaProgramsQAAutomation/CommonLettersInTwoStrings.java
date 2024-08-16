package JavaProgramsQAAutomation;

import java.util.HashSet;

public class CommonLettersInTwoStrings {

	public static void main(String[] args) {
		String sen1 = "happy";
		String sen2 = "elephant";
		char[] s1 = sen1.toCharArray();
		char[] s2 = sen2.toCharArray();
		HashSet<Character> set1 = new HashSet<Character>();
		HashSet<Character> set2 = new HashSet<Character>();

		for (char x1 : s1) {
			set1.add(x1);
		}
		for (char x2 : s2) {
			set2.add(x2);
		}
		set1.retainAll(set2);
		for (char x : set1) {
			System.out.println("Commen Letter in the two given strings: " + x);
		}

	}

}
