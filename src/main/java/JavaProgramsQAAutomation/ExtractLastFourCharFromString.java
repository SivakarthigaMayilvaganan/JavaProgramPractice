package JavaProgramsQAAutomation;

public class ExtractLastFourCharFromString {

	public static void main(String[] args) {
		String web="www.google.com";
		String LastFour=web.substring(web.length()-4, web.length());
		System.out.println("Last Four Characters: "+LastFour);
		String FirstFour=web.substring(0, 4);
		System.out.println("First Four Characters: "+FirstFour);
		String Website=web.substring(4, web.length()-4);
		System.out.println("Website: "+Website);
	}

}
