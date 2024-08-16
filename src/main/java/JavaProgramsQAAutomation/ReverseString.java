package JavaProgramsQAAutomation;

public class ReverseString {

	public static void main(String[] args) {
		String name="Sivakarthiga";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("Reversed String: "+rev);
		
		StringBuffer sb=new StringBuffer(name);
		String rev1=sb.reverse().toString();
		System.out.println("Reversed String: "+rev1);
	}

}
