package constructorinjava;

public class AnilPatil {

	int p;
	double d;
	
	public static void main(String[] args) {
		
		AnilPatil s1=new AnilPatil(); //calling default constructor
		s1.show(); //calling Sum Method
		s1.multiply(); //calling Multiply Method
		
		
	    AnilPatil s2=new AnilPatil(25,55.55); //calling Parameterized constructor
		s2.show(); //calling Sum Method
		s2.multiply(); //calling Multiply Method
	}
	
	public AnilPatil() //Default Constructor
	{
		p=50;
		d=15.5;
		System.out.println("Value of P:" +p);
		//this.show();
		//this.multiply();
	}
	
	public AnilPatil(int p, double d) //Parameterized Constructor	
	{
		this.p=p;
		this.d=d;
	}
	
	public void show() 	//Sum Method
	{
		System.out.println("Value of p: " +p);
		System.out.println("Value of d: " +d);
	}
	
	public void multiply() 	//Multiply Method
	{
		System.out.println("Multiplication is: "+p*d);
	}
}
