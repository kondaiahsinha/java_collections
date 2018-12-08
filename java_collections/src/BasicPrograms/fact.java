package BasicPrograms;

public class fact{
	static int factm(int n) {
		if(n==1) return 1;
		return n*factm(n-1);
	}
	public static void main(String[]args) {
		int n=5;
		System.out.println(factm(n));
	}

}
