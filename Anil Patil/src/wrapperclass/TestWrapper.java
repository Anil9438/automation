package wrapperclass;

public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//__Converting Primitive Data into Object_	
		
		int s=55;   //Primitive Data		
		Integer p=new Integer(s); 
		System.out.println("Value of s Primitive Data:" +s);
		System.out.println("Value of p Object Data:" +p);
		
		Integer k=Integer.valueOf(s); //Explicit Conversion
		System.out.println("Value of k Object Data: "+k);
		
		double d=55.785; 
		Double n=d;       //autoboxing - Implicit Conversion
		System.out.println("Value of n Object Data: "+n);
		
		Double q=Double.valueOf(d);
		System.out.println("Value of q object data: "+q);
		
		//_Converting Object into Primitive Data_
		
		Float f=new Float(45.55);
		float v=f.valueOf(f);
		System.out.println("Value of v float data: "+v);
		
		Integer z=new Integer(200);
		int l=z.valueOf(z);
		System.out.println("Value of l Data: "+l);
		

	}

}
