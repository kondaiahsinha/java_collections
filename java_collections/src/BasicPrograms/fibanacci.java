package BasicPrograms;

public class fibanacci {

	public static void main(String[] args) {
		
		int val=10;				//fibanacci witout recursion
		int fib=0,fib1=1;
		
		for(int i=1;i<=val;i++) {
			System.out.print(fib+ " +");
			int ffib=fib+fib1;
			fib=fib1;
			fib1=ffib;
			
		}
	
	}

}
