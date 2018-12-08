package BasicPrograms;

import java.util.Scanner;

public class StrPolindrom {
	public static void main(String []args) {
		String original="",sb="";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string:");
		original=sc.nextLine();
		System.out.println("String Polindrom: \n"+"Original String: "+original);
		for(int i=original.length()-1;i>=0;i--) {
			sb=sb+original.charAt(i);
		}
		
		System.out.println("Reverse String: "+sb);
		if(sb.equals(original))
			System.out.println("this is string polindrom");
		else
			System.out.println("This not string polindrom");
		
	}

}

/* using String Buffer
 * String original="hellolleh";
		System.out.println("String Polindrom: "+original);
		StringBuffer sb=new StringBuffer(original);
		sb.reverse();
		
		System.out.println(sb);
		if(sb.toString().equals(original))
			System.out.println("this is string polindrom");
		else
			System.out.println("This not string polindrom");
 */