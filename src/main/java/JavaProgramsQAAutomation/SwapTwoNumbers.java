package JavaProgramsQAAutomation;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x: " + x + ", y: " + y);

		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
	}

}
