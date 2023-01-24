package collectioninjava;

import java.util.HashSet;

public class HashSetInJava {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			HashSetInJava h=new HashSetInJava();
			h.hashSetMethods();
		}
		
		public void hashSetMethods()
		{
			HashSet<Integer> a=new HashSet();
				
			a.add(new Integer(25));
			a.add(new Integer(85));
			a.add(new Integer(25)); //no duplicate values
			a.add(null);            // no insertion order maintained
			a.add(new Integer(85));
			System.out.println(a);
			
			a.remove(new Integer(85));
			a.remove(0); //no removal by position
			System.out.println(a);
			
			// HashSet of Type String
			HashSet<String> a2 = new HashSet();
			a2.add("Hi");
			a2.add("Hello");
			a2.add(null);
			a2.add("Hi");
			a2.add("45");
			System.out.println(a2);
			
			//HashSet with all types of Object
			
			HashSet<Object> a3 = new HashSet();

			a3.add(new Integer(11));
			a3.add(new Float(36.74f));
			a3.add(new Boolean(false));
			a3.add(new Double(23.25));
			a3.add(new Double(23.25));
			System.out.println(a3);
		}
	}
