package practice;

public class TestWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=55;
		
		//Converting Primitive Data Types into the Object
		
		Integer a=new Integer(55);
		System.out.println("Value of Object a:" +a);
		
		Integer b=Integer.valueOf(x); //Explicit Conversion
		System.out.println("Value of Primitive Data b: " +b);
		
		Integer c=x; //Implicit Conversion
		System.out.println("Value of Object c: " +c);
		
		//Converting Object into the Primitive Data Types
		
		Float f=new Float(55.25f);
		float g=f.floatValue();
		System.out.println("Value of Primitive Data g: " +g);

	}

}
