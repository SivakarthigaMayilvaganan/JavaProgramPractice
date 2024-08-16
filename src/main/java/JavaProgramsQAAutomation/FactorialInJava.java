package JavaProgramsQAAutomation;

public class FactorialInJava {

	public static void main(String[] args) {
		int n=3;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
			
		System.out.print(n+"!="+fact);
	}

}
