package JavaProgramsQAAutomation;

public class CountofCapitalizedWordsInString {

	public static void main(String[] args) {
		String str = "QaAutomationTesterSivakarthiga";
		int con = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				con++;
			}
		}
		System.out.println(con);
	}

}
