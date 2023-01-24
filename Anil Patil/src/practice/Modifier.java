package practice;

//Same Class Same Package

public class Modifier {
	
	public int a;
	private double b;
	float c;
	protected boolean d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Modifier a=new Modifier();
		a.getA();
		a.getB();
		a.getC();
		a.getD();
		
	}
	
	public int getA()
	{
		return a;
	}
	
	private double getB()
	{
		return b;
	}
	
	float getC()
	{
		return c;
	}
	
	protected boolean getD()
	{
		return d;
	}
	
	

}
