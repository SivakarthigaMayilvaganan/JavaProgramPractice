package JavaProgramsQAAutomation;

public class MissingNumberInAArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,9,10};
		int sum=0;
		int sumI=0;
		for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		}
		
		for(int i=0;i<=10;i++) {
			sumI=sumI+i;
			}
		int diff=sumI-sum;
		System.out.println("The missing No. in the given Array 1 to 10: "+diff);
	}

}
