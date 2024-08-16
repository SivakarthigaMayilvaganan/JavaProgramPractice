package JavaProgramsQAAutomation;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsFromSentence {

	public static void main(String[] args) {
		String sentence = "I AM A QA TESTER QA TESTER QA";
		String[] sen = sentence.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (String s : sen) {
			set.add(s);
		}
		String a="";
		for(String x:set) {
			a=a+x+" ";
		
		}
		System.out.println("sentence: " + a);
	}

}
