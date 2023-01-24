package collectioninjava;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> h=new HashMap();
		h.put(5,"Anil");
		h.put(6,"Anil"); //add same value at different place
		h.put(1, "Vinay");
		h.put(2, "Suvarna");
		h.put(1, "Navya"); //replace with updated value
		h.put(3, "Kavya"); //Order maintains
		System.out.println(h);
		
		h.remove(3);
		System.out.println(h);
	}

}
