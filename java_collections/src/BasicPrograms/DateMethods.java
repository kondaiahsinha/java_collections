package BasicPrograms;

import java.util.Date;

public class DateMethods {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("\n"+date);
		System.out.println("\n"+date.getDate());
		System.out.println("\n"+date.getDay());
		System.out.println("\n"+date.getHours());
		System.out.println("\n"+date.getTimezoneOffset());
		System.out.println("\n"+date.toGMTString());
		System.out.println("\n "+date);
	}

}
