package practice;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListInJava ll=new LinkedListInJava();
		ll.linkedListMethod();

	}
	
	public void linkedListMethod()
	{
		LinkedList <Integer> list=new LinkedList();
		
		list.add(new Integer(40));
		list.add(new Integer(50));
		list.add(new Integer(60));
		list.add(new Integer(70));
		list.add(new Integer(40)); //takes duplicate values
		list.add(null);
		list.add(85);
		list.addFirst(100);
		list.addLast(10);
		list.add(3, 25);
		//list.add(new Float (90));
		//list.remove(0);
		list.removeFirst();
		list.removeLast();
		
		list.add(2, new Integer (80));
		
		System.out.println(list);
		
		/*Iterator i=list.iterator();
		
		while(i.hasNext())
		{
			System.out.println("Iterator: " +i.next());
		}*/
				
	}

}
