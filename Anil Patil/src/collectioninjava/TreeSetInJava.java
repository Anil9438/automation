package collectioninjava;

import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSetInJava ts=new TreeSetInJava();
		ts.treeSetMethods();
	}
	
	public void treeSetMethods()
	{
		//TreeSet of Type Integer
		TreeSet <Integer> t=new TreeSet();
		t.add(new Integer (10)); //Insertion Order maintains
		t.add(new Integer (20));
		t.add(new Integer (30));
		t.add(new Integer (40));
		t.add(new Integer (40)); //No duplicate
				
		System.out.println("TreeSet: "+t);
		
		t.remove(new Integer(10));
		System.out.println("TreeSet: "+t);
		
		//TreeSet of Type Character
		TreeSet <Character> t1=new TreeSet();
		//t1.add(null); Null Not allowed it shows Null POinter Exception
		t1.add('a');
		t1.add('A');
		t1.add('s');
		t1.add('S');
		
		System.out.println("TreeSet Character: "+t1);
		
		t1.remove('A');
		System.out.println("TreeSet Character: " +t1);
		
		//TreeSet of Type Object
		TreeSet <Object> t2=new TreeSet();
		t2.add(new Integer(20));
		t2.add(new Integer(30));
		t2.add(new Integer(50));
		
		//t2.add(new Boolean (false)); can't add
		//t2.add(new Float(20.58));    can't add
		//t2.add(new Character ('A')); can't add
		//t2.add(new Double (10.25));  can't add
		
		System.out.println("TreeSet Object: "+t2);
		
		t2.remove(new Integer(20));
		System.out.println("TreeSet Object: "+t2);
	}

}
