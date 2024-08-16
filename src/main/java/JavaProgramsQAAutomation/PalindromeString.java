package JavaProgramsQAAutomation;

public class PalindromeString {

	public static void main(String[] args) {
		String name="nitin";
		
		StringBuffer sb=new StringBuffer(name);
		String revName=sb.reverse().toString();
		if(name.equalsIgnoreCase(revName)) {
		System.out.println("It's Palindrome");
		}else {
			System.out.println("It's not Palindrome");
		}
	}
	}