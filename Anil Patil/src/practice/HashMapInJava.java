package practice;

import java.util.HashMap;

public class HashMapInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapInJava hm=new HashMapInJava();
		hm.hashMapMethod();

	}
	
	public void hashMapMethod()
	{
		HashMap <Integer, String> h=new HashMap();
		h.put(1, "Anil");
		h.put(2, "Ramesh"); //no duplicate but replace values with latest one
		h.put(6, "Anil");
		h.put(3, "Suvarna");
		h.put(4, "Navya");
		h.put(5, "Kavya");
		h.put(7, "Kavya"); //values can be duplicate but keys are not allowed
		h.put(8, null);
		
		//h.remove(2);
		
		
		//System.out.println(h);
		
		System.out.println("Keys:\n" + h.keySet());
		System.out.println();
		System.out.println("Values:\n" + h.values());
		System.out.println();
		System.out.println("Kay and Values:\n" + h.entrySet());
		System.out.println();
		System.out.println("Size: " +h.size());
		//h.clear();
		System.out.println();
		System.out.println("isEmtpy: " + h.isEmpty());
	}

}
