package JavaProgramsQAAutomation;

public class PalindromeInteger {

	public static void main(String[] args) {
		int num = 12121;
		int rev = 0;
		System.out.println(num);
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println(rev);

		System.out.println("It's a palindrome no.");

	}

}
