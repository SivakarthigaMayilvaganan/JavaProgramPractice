package JavaProgramsQAAutomation;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first=0;
		int second=1;
		int num=10;
		for(int i=0;i<=num;i++) {
			System.out.print(first+",");
			int third=first+second;
			first=second;
			second=third;
		}

	}

}
