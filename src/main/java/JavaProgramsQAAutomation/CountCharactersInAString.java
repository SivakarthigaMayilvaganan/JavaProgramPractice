package JavaProgramsQAAutomation;

public class CountCharactersInAString {

	public static void main(String[] args) {
		String word="tester";
		String newWord=word.replaceAll("t", "");
		int countOfTheGivenCharacter=word.length()-newWord.length();
		System.out.println("Count of the given character in the String: "+countOfTheGivenCharacter);
		

	}

}
