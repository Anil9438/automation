package collectioninjava;

import java.util.LinkedList;

public class LinkedListInJava {
	
	public void linkedListMethods()
	{
		
		//LinkedList of Type Integer
		LinkedList<Integer> s=new LinkedList();
		Integer a=new Integer(20);
		s.add(a);
		
		s.add(new Integer (35));       // Insertion order maintains
		s.add(new Integer (45));
		s.add(new Integer (55));
		s.add(1,new Integer (65));   // Can add value at any position
		s.add(null);                // Null value allowed
		s.add(new Integer (35));   //duplicate values allowed
		
		System.out.println("Int AL Add s: "+s);
		
		s.remove(0);  // Remove data by position
		System.out.println("Int AL Remove s:" +s);
		
		s.remove(new Integer(65)); //Remove data by Value
		System.out.println("Int AL Remove s:" +s);
		
		Integer k=new Integer(20);
		s.add(k);
		
		System.out.println("Int AL Add k:" +s);
		
		//LinkedList of Type String
		
		LinkedList <String> s1=new LinkedList();
		s1.add("Hello");
		s1.add("Anil");
		s1.add("Patil");
		s1.add("Welcome");
		s1.add("2023");
		s1.add(3,"Warm");
		
		System.out.println("String AL Add s1: "+s1);
		
		s1.remove(0);
		s1.remove("Happy to warm");
		System.out.println("String AL Remove s1: "+s1);
		
		LinkedList<String> s2=new LinkedList();
		
		s2.addAll(s1);		
		System.out.println("String AL Disp s1 into s2: "+s2);
		
		//LinkedList of Type String		
		LinkedList<Object> s3=new LinkedList(); //can add any type of data
		s3.add(s);
		s3.add(s1);
		s3.add(new Integer(60));
		s3.add(new Float(55.55f));
		s3.add(new Boolean(true));
		s3.add("Hello");
		s3.add(null);
		s3.add(new Double (78.987));
		
		System.out.println("Object AL s3: "+s3);
		
		s3.remove(0);
		System.out.println("Object AL Remove s3: "+s3);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListInJava l=new LinkedListInJava();
		l.linkedListMethods();

	}

}
