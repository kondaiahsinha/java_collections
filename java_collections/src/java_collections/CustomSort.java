package java_collections;

import java.util.*;

public class CustomSort {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(2);
		al.add(7);
		al.add(1);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		ArrayList cs=new ArrayList();
		cs.addAll(al);
		cs.add(9);
		System.out.println(cs);
		Collections.sort(cs, new myComparator());
		System.out.println(cs);
		employee e1=new employee(1,"sinha");
		employee e2=new employee(4,"hareesh");
		employee e3=new employee(2,"vinod");
		employee e4=new employee(1,"kondaiah");
		employee e5=new employee(2,"od");
		ArrayList emp=new ArrayList();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		System.out.println(emp);
		System.out.println(emp);
		Collections.sort(emp,new myEmpComparator());
		System.out.println(emp);
		//TreeSet ts=new TreeSet(new myEmpComparator());
		//ts.addAll(emp);
		//System.out.println(ts);
		//somthing
	}
}
class employee{
	int id;
	String name;
	
	employee(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return id+" "+name;
	}
}

class myEmpComparator implements Comparator{
	
	public int compare(Object o1, Object o2) {
		employee eid1=(employee)o1;
		employee eid2=(employee)o2;
		Integer id1=eid1.id;
		Integer id2=eid2.id;
		String s1=eid1.name;
		String s2=eid2.name;
		int res=id1.compareTo(id2); // if id's same than compare the name's
		if(res==0) {
			res=s1.compareTo(s2);
		}
		return res;
	}
}

class myComparator implements Comparator{

	public int compare(Object obj1, Object obj2) {
		
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return i2.compareTo(i1);
	}
	
}

