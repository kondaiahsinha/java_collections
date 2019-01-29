
public class polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=123;
		int b=a;
		int c,d=0,e;
		while(a>0) {
		c=a%10;
		d=d*10+c;  
		a=a/10;
		}
		if(b==d)
			System.out.println("yes polindrom");
		else
			System.out.println("no");
		

	}

}
