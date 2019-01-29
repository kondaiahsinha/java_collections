
public class fibanacci {
	int fib(int n) {
		int f,f1,f2;
		if(n==1 || n==0) f=n;
		else 
			  f=fib(n-1)+fib(n-2);
		//System.out.println(f);
		return f;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with recursion
		fibanacci fb=new fibanacci();
		int n=10;
		for(int i=0;i<=n;i++) {
		System.out.println(fb.fib(i));
		}
		//with recursion
		
		/* Without recurtion
		 * int n=10,t=0;
		for(int i=0;i<=n;i++) {
			t=t+i;
			System.out.println(t);
		}
		System.out.println(t); */

	}

}
