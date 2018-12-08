package BasicPrograms;

public class polindrom {

	public static void main(String[] args) {
		int val=12321,dup=0;
		int c=val;
		int a,b;
		
		for(int i=0;val>0;i++) {
			a=val%10;
			dup=a+(dup*10);
			val=val/10;
			System.out.println("a "+a+" dup "+dup+" val "+val);
		}
		if(dup==c) {
			System.out.println("this is polindrom");
		}
		else {
			System.out.println("This is not polindrom");
		}

	}

}
