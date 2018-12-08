package java_collections;

import java.util.*;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap();
		hm.put(1,"kondaiah");
		hm.put(3, "vinod");
		hm.put(5,"haresh");
		hm.put(2,"sinha");
		hm.put(4,"od");
		hm.put(1,"kondaiah sinha");
		
		System.out.println(hm);
		System.out.println(hm.get(1)+" "+hm.get(2));
		hm.replace(4, "kalak"); //To Update
		//hm.remove(4);
		Collection<String> values=hm.values();
		for(String val:values) 
			System.out.println("only values:"+val); //for only values
		System.out.println(hm);
		Set<Integer> keys=hm.keySet();
		for(Integer key:keys)
			System.out.println(key);
		Set<Entry<Integer,String>> keyvalueSet= hm.entrySet();
		for(Entry<Integer,String> entry:keyvalueSet) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
