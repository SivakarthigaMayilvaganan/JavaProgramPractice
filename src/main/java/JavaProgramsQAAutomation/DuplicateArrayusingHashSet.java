package JavaProgramsQAAutomation;

import java.util.HashSet;

public class DuplicateArrayusingHashSet {

	public static void main(String[] args) {
		int[] a= {1,6,8,0,6,0,2};
		HashSet<Integer> set=new HashSet<Integer>();
		for(int x:a) {
			if(!set.add(x)) {
				System.out.println("Duplicate Element: "+x);
			}
		}
	
	}

}
