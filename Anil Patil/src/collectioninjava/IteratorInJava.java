package collectioninjava;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IteratorInJava p=new IteratorInJava();
		p.useIterator();	
		p.stringCollection();

	}
	
	public void useIterator()
	{
		ArrayList <Integer> a=new ArrayList();
		a.add(new Integer (20));
		a.add(new Integer (30));
		a.add(new Integer (40));
		a.add(new Integer (50));
		
		System.out.println("ArrayList: "+a);
		
		Iterator <Integer> i=a.iterator();
		while(i.hasNext())
		{
			Integer n=i.next();
			if(n<=30)
			{
				i.remove();			
			}
		}
		
		System.out.println(a);
		
		for (Integer x:a)
		{
			System.out.println(x);
		}
	}
	
	public void stringCollection()
	{
		ArrayList<String> a = new ArrayList();

		a.add("Hi");
		a.add("Hello");
		a.add("Bye");
		System.out.println(a);
		
		Iterator<String> j=a.iterator();
		while(j.hasNext())
		{
			String n=j.next();
			System.out.println(n);
		}

	}

}
