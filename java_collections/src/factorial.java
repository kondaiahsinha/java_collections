
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		facto fc1=new facto();
		//System.out.println(fc1.fc(5,1));
		System.out.println(fc1.fcr(6));
		//fc1.fcr(5);
		//fc1.fc();

	}

}

class facto{
	
	int fc(int a,int fac){
		//int a=6,fac=1;
	for(int i=1;i<=a;i++) {
		//if(i==0) return fact=1;
		fac=fac*i;
	}
	return fac;
	}
	int f=1;
	int fcr(int n) {
		if(n==0) return 1;
		else
		f=n*fcr(n-1);
		//System.out.println("working");
		return f;
	}
}