package JavaProgramsQAAutomation;

import java.util.Arrays;

public class DuplicatesInArrayUsingBruteForceMethodAndSorting {

	public static void main(String[] args) {
		int[] a= {1,6,8,0,6,0,2};
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1]){
				System.out.println("Duplicate Elemnt using Sorting: " + a[i]);
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]){
				System.out.println("Duplicate Elemnt using BruteForceMethod: " + a[i]);
			}
			}
		}
	}

}