package BasicPrograms;

public class fib_recursion {
	public static void main(String []args) {
		int count=10;
		fib f=new fib();
		//f.fiba(count);
		System.out.println(f.fiba(count));
	}

}

class fib{
	int ffib=0;
	int fiba(int n) {
		if(n<=1) return n;
		 ffib=fiba(n-1)+fiba(n-2);
		 return ffib;
	}
	
	
}