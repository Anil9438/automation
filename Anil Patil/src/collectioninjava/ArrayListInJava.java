package collectioninjava;

import java.util.ArrayList;

public class ArrayListInJava {
	
	public void arrayListMethods()
	{
		
		//ArrayList of Type Integer
		ArrayList<Integer> s=new ArrayList();
		Integer a=new Integer(20);
		s.add(a);
		
		s.add(new Integer (35));
		s.add(new Integer (45));
		s.add(new Integer (55));
		s.add(1,new Integer (65));
		s.add(null);
		
		System.out.println("Int AL Add s: "+s);
		
		s.remove(0);
		System.out.println("Int AL Remove s:" +s);
		
		s.remove(new Integer(65));
		System.out.println("Int AL Remove s:" +s);
		
		Integer k=new Integer(20);
		s.add(k);
		
		System.out.println("Int AL Add k:" +s);
		
		//ArrayList of Type String
		
		ArrayList <String> s1=new ArrayList();
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
		
		ArrayList<String> s2=new ArrayList();
		
		s2.addAll(s1);		
		System.out.println("String AL Disp s1 into s2: "+s2);
		
		//ArrayList of Type String		
		ArrayList<Object> s3=new ArrayList();
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
		
		ArrayListInJava p=new ArrayListInJava();
		p.arrayListMethods();

	}

}
