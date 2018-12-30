package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class ArrayReverse {

	public static void main(String[] args) {
		int [] a= {10,20,30,5,11,25};
		int [] b =new int[a.length];
		String[] s= {"a","b","c"};
		for(int i=a.length-1,j=0;i>=0;i--,j++) {
			b[j]=a[i];
		}
		System.out.print("Original array:");
		for(int i:a)
			System.out.print(i+" ");
		System.out.print("\nReverse array:");
		for(int i:b)
			System.out.print(i+" ");
		boolean t=Arrays.asList(a[0]).contains(10);
		boolean t1=Arrays.toString(s).contains("a");
		System.out.println("\n"+t1+" "+t);
		//convert array to ArrayList
		ArrayList al=new ArrayList(Arrays.asList(a));
		//System.out.print(al.toString());
	Arrays.sort(a);
	for(int i:a)
		System.out.print(i+" ");
	
	}
}
