package BasicPrograms;

public class test {
	static int fibi(int b) {
		if(b<=1) return b;
		return fibi(b-1)+fibi(b-2);
	}
	public static void main(String []args) {
		int n=10;
		//fib f=new fib();
		System.out.println(fibi(n));
	}

}


/* class fib{
	int fibi(int b) {
		if(b<=1) return b;
		return fibi(b-1)+fibi(b-2);
	}
} */