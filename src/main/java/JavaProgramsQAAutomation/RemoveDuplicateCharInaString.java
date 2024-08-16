package JavaProgramsQAAutomation;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInaString {

	public static void main(String[] args) {
		String name = "qqqqwwwwettttyuuuu";
		char[] a = name.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (char x : a) {
			set.add(x);
		}
		StringBuffer sb = new StringBuffer();
		for (char s : set) {
			sb.append(s);
		}
		System.out.println("word: " + sb.toString());
	}
}