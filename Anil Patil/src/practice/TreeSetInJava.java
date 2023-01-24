package practice;

import java.util.TreeSet;

public class TreeSetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSetInJava ts=new TreeSetInJava();
		ts.treeSetMethod();
		ts.treeSetObject();

	}
	
	public void treeSetMethod()
	{
		TreeSet <Integer> ts1=new TreeSet();
		
		ts1.add(new Integer(20));
		ts1.add(new Integer(30));
		ts1.add(new Integer(40));
		//ts1.add(1, new Integer(10)); no insertion order can change
		ts1.add(new Integer(50));
		ts1.add(new Integer(30)); //no duplicate values
		//ts1.add(null);// no null values
		//ts1.add(new Float(20.20f)); no other type data allowed
		
		
		System.out.println("TreeSet:\n"+ts1);
		
	}
		
	public void treeSetObject() 
		
	{
		TreeSet <Object> obj=new TreeSet();
		//It takes same data types only
		//obj.add(new Integer(10));
		//obj.add(new Float(20.1f));
		//obj.add(new Float(30.15f));
		//obj.add(new Double(30.20));
		obj.add(new Character('A'));
		obj.add(new Character('a'));
		
		System.out.println("Object: \n" +obj);
	}
		
	}
