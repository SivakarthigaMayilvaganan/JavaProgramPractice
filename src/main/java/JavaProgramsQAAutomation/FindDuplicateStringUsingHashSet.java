package JavaProgramsQAAutomation;

import java.util.HashSet;

public class FindDuplicateStringUsingHashSet {

	public static void main(String[] args) {
		String name="TESTER";
		char[] a=name.toCharArray();
		HashSet<Character> set=new HashSet<Character>();
		for(char x:a) {
			if(!set.add(x)) {
				System.out.println("Duplicate Element: "+x);
			}
		}
	

	}

}
