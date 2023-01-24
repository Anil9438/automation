package collectioninjava;

import java.util.LinkedHashSet;

public class LinkedHashSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSetInJava lhs=new LinkedHashSetInJava();
		lhs.linkedHashSetMethods();

	}
	
	public void linkedHashSetMethods()
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet();
		ls.add(new Integer(45));
		ls.add(new Integer(55));
		ls.add(new Integer(55));//No Duplicate Values
		ls.add(new Integer(65));
		ls.add(null);
		
		System.out.println("LHS of type Int: "+ls );
		
		ls.remove(new Integer(65)); //Removal by Value only
		System.out.println("LHS of type Int: "+ls );
		
		//Linked HashSet of Type String
		LinkedHashSet<String> ls1=new LinkedHashSet();
		ls1.add("Hello");
		ls1.add("Anil");
		ls1.add("Patil");
		ls1.add(null);
		
		System.out.println("LHS of type Int: "+ls1);
		
		ls1.remove(null); //Removal by Value only
		System.out.println("LHS of type Int: "+ls1);
		
		//Linked HashSet of Type Object
		LinkedHashSet<Object> ls2=new LinkedHashSet();
		ls2.add(new Integer (55));
		ls2.add(new Boolean(true));
		ls2.add(new Double (45.555));
		ls2.add(new Float (50.06));
		
		System.out.println("LHS of Type Object: "+ls2);
		
		ls2.remove(new Integer (55));
		System.out.println("LHS of Type Object: " +ls2);
				
	}

}
