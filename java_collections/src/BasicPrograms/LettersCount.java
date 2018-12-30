package BasicPrograms;

import java.util.TreeMap;

public class LettersCount {

	public static void main(String[] args) {
			String str="heloow spark & scala is trend now";
			int j=1;
			TreeMap tm= new TreeMap();
			for(int i=0;i<=str.length()-1;i++) {
				char s=str.charAt(i);
				if(tm.containsKey(s)) {
					//if key already there (Repeated keys enter in this block)
					j=(int) tm.get(s)+1; // repeated key value and add 1 for repeating
				}
				tm.put(s,j ); // just add key as letters and value as frequency or count of repetition
				j=1; // reassign j=1 otherwise it's increase continuously non repeated letters
			}
			System.out.println("\n"+tm); //tree view
			System.out.println(tm.entrySet()); //set view

	}

}
