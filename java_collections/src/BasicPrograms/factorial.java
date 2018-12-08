package BasicPrograms;

public class factorial {
	public static void main(String []args) {
		int n=5,fact=1;
		for(int i=1;i<=n;i++) {
			System.out.print(fact+" * "+i+" = ");
			fact=fact*i;
			System.out.println(fact);
		}
		//System.out.println(fact);
	}

}
