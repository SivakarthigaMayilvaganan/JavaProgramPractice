package JavaProgramsQAAutomation;

public class RemoveAllWhiteSpaceUsingReplace {

	public static void main(String[] args) {
		String sen = "I     AM A  QA   TESTER";
		String s = sen.replaceAll("\\s+", "");
		System.out.println("sentence: " + s);
	}

}
