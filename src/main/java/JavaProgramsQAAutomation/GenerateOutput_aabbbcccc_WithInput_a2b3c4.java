package JavaProgramsQAAutomation;

public class GenerateOutput_aabbbcccc_WithInput_a2b3c4 {

	public static void main(String[] args) {
		String str = "a2b3c4";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			} else {
				int x = Character.getNumericValue(str.charAt(i));
				for (int j = 1; j < x; j++) {
					System.out.print(str.charAt(i - 1));
				}
			}
		}
	}
}
