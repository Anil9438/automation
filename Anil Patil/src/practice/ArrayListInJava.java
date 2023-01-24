package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListInJava al=new ArrayListInJava();
		al.arrayListMethod();

	}
	
	public void arrayListMethod()
	{
		ArrayList<Integer> s=new ArrayList();
		
		Integer p=new Integer(55);
		s.add(p);
		s.add(new Integer(60));
		s.add(new Integer(70));
		s.add(new Integer(80));
		//s.add(null);
		s.add(new Integer(60));
		
		System.out.println(s);
		
		s.add(1, new Integer(90));
		s.remove(0);
		//s.add(new Float(10.10f));
		//s.add(new Double(30));
		
		System.out.println(s);
		
		//Iterator
		Iterator <Integer> itr=s.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		/*while(itr.hasNext())
		{
			Integer n=itr.next();
			if(n<80)
			{
				itr.remove();
			}
			
			System.out.println("Iterator:" +(s));
			
		}*/
		
		for(Integer y:s)
		{
			System.out.println(y);
		}
		
		
	/*	//ArrayList of String Type		
		ArrayList <String> str=new ArrayList();
		
		String sp=new String("Hello");		
		str.add(sp);
		str.add(new String("Mr Anil"));
		str.add(1, new String("Patil"));
		
		str.remove(new String ("Patil"));
		
		System.out.println(str);
		
		ArrayList <Object> o=new ArrayList();
		o.addAll(s);
		o.addAll(str);
		o.add(new Float(30.03f));
		
		System.out.println(o); */
		
	}
	

}
