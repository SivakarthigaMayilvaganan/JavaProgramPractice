package JavaProgramsQAAutomation;

public class MultiplierOf5and7Check {

	public static void main(String[] args) {
		int num=50;

		for(int i=1;i<=num;i++){
		   if(i%5==0 && i%7==0){
		       System.out.println(i+".Multiplier of 5 & 7");
		   }else if(i%5==0){
				System.out.println(i + ".Multiplier of 5");
			}else if (i%7 == 0) {
				System.out.println(i + ".Multiplier of 7");
			} else {
				System.out.println(i + ".");
			}	       
		   }

	}

}
