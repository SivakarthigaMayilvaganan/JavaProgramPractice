package JavaProgramsQAAutomation;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=10;
		int con=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) {
				con++;
			}	
		}
		if(con==2) {
			System.out.println("This is a prime no.: "+num);
		}else {
			System.out.println("This is not a prime no.: "+num);
		}
	}

}
