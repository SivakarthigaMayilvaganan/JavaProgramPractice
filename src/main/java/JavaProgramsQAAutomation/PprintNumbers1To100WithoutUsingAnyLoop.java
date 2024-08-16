package JavaProgramsQAAutomation;

public class PprintNumbers1To100WithoutUsingAnyLoop {

	public static void main(String[] args) {
		printNum(1);
	}

	public static void printNum(int num) {
		if (num <= 10) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}

}
