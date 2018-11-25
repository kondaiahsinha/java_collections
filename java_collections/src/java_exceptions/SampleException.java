package java_exceptions;

public class SampleException {

	public static void main(String[] args) {
		try {
			Integer [][] sample= {{1,2,5},{null},{8,6}};
			System.out.println("values"+sample[1][1].intValue());
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//e.getCause();
			//e.getMessage();
			//e.toString();
		}

	}

}
