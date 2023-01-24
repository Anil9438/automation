package accessmodifier;

//Same Class, Same Package

public class A {
	
	public int p;           // Access Modifier - Public
	private double q;      // Access Modifier - Private
	float r;              // Access Modifier - Default
	protected boolean s; // Access Modifier - Protected

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new A();
		a.getPublic();
		a.getPrivate();
		a.getDefault();
		a.getProtected();

	}
	
	public int getPublic()
	{
		return p;
	}
	
	private double getPrivate()
	{
		return q;
	}
	
	float getDefault()
	{
		return r;
	}
	
	protected boolean getProtected()
	{
		return s;
	}

}
