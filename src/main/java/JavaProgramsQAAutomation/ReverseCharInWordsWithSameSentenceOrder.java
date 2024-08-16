package JavaProgramsQAAutomation;

public class ReverseCharInWordsWithSameSentenceOrder {

	public static void main(String[] args) {
		String sentence="I AM A QA AUTOMATION TESTER";
		String[] sen=sentence.split(" ");
		String rev="";
		
		for(int i=0;i<sen.length;i++) {
			StringBuffer bf=new StringBuffer(sen[i]);
			rev=rev+bf.reverse().toString()+" ";
		}
		System.out.println("Reversed Char of the Words in a sentence: "+rev);
	}

}
