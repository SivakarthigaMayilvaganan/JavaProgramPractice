package JavaProgramsQAAutomation;

public class ReverseWordsInASentence {

	public static void main(String[] args) {
		String sentence="I AM A QA AUTOMATION TESTER";
		String[] sen=sentence.split(" ");
		String rev="";
		for(int i=sen.length-1;i>=0;i--) {
			rev=rev+sen[i]+" ";
		}
		System.out.println("Reversed Words in a sentence: "+rev);
	}

}
