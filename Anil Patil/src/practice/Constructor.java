package practice;

public class Constructor extends Methods {
	
	int a;
	double b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor c=new Constructor();
		c.display();
		c.sum();
		
		//Constructor d=new Constructor(10,30.20);
		//d.sub();		

	}
	
	public Constructor()
	{
		super(200);
		a=50;
		b=100;
	}
	
	/*public Constructor(int a, double b)
	{
		this.a=a;
		this.b=b;
	}*/
	
	public void display()
	{
		System.out.println("a="+a+", "+"b="+b);
	}
	
	public void sub()
	{
		System.out.println("Sub= "+(b-a));
	}

}
