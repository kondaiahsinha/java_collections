package java_collections;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1,"kondaiah");
		hm.put(3, "vinod");
		hm.put(5,"haresh");
		hm.put(2,"sinha");
		hm.put(4,"od");
		
		System.out.println(hm);
		System.out.println(hm.get(1)+" "+hm.get(2));
		hm.replace(4, "kalak");
		System.out.println(hm);
	}

}
