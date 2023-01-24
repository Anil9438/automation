package returntypeinjava;

//Practice-----

import methodwithparameter.TestMethod;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P l=new P();
		System.out.println("Multiplication is: "+l.show(45, 100));
		
		System.out.println("Boolean Value: "+l.display(25, 10));
		
		System.out.println("Float value: "+l.Con());
		
		l.Msg();
		
		System.out.println("Float is "+l.a());
		
		jay();
		
		ReturnTypeInJava p=new ReturnTypeInJava();
		p.return_boolean();
		System.out.println("Boolean: "+p.return_boolean());
		
		TestMethod tm=new TestMethod();
		tm.divide();		

	}
	
	public static void jay()
	{
		System.out.println("Hello Jay");
	}
	
	public void Msg()
	{
		System.out.println("No Return");
	}
	
	public float a()
	{
		return 34.5f;
	}
	
	public int show(int a, int b)
	{
		return a*b;
	}
	
	public boolean display(int a, int b)
	{
		boolean c= a>b;
		return c;
	}
	
	public float Con() 
	{
		return 34.10f*50.5f;
	}

}
