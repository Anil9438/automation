package practice;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum();
		
		Methods m=new Methods(0);
		m.divide(50,30);
		m.avg();
		System.out.println("Divide: "+m.divide());

	}
	
	public Methods (int x)
	{
		System.out.println("Value of x: "+x);
	}
	
	public void sum()
	{
		int a=50, b=60, c;
		c=a+b;
		System.out.println("Value of Method Sum c: "+c);
	}
	
	public void divide (int d, int e)
	{
		float f=(float)d/e;
		System.out.println("Value of Divide f: "+f);
	}
	
	public void avg()
	{
		int g=60, h=70, i=80;
		
		int avg=(g+h+i)/3;
		System.out.println("Avg is: "+avg);
	}
	
	public int mutiply (int q, int r)
	{
		return q*r;
	}
	
	public double divide ()
	{
		int lm=25, dm=57;
		return ((double)lm/dm);
	}

}
