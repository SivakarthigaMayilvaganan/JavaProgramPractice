package JavaProgramsQAAutomation;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String word1="qwert";
		String word2="asdfg";
        char[] a1=word1.toCharArray();
        char[] a2=word2.toCharArray();
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        
        if(a1.equals(a2)) {
        	System.out.println("Given words are ANAGRAM");	
        }else {
        	System.out.println("Given words are NOT ANAGRAM");	
        }
	}

}
