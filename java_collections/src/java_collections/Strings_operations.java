package java_collections;

public class Strings_operations {

	public static void main(String[] args) {
		isPolindro pl=new isPolindro();
		pl.isPolindrom("kalak");
	}

}

class isPolindro{
	public  void isPolindrom(String str) {
		System.out.println("start");
		if(str==null) {
			System.out.println("pass a string");
		}
		System.out.println("start1");
		StringBuilder strBuilder=new StringBuilder(str);
		strBuilder.reverse();
		System.out.println(strBuilder+" "+str);
		if(str.equals(strBuilder.toString())) System.out.println("its polindrome");
		else System.out.println("its not polindrom");
	}
	
}