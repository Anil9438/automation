package exceptionhandling;

public class ExceptionHandling {
	
	int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandling e=new ExceptionHandling();
		e.handleException(10, 0); 
	}
	
	public void handleException(int s, int p)
	{
		int z[]= {10,20,30,40};
		try
		{
			int k=z[4]/z[1];
			//a=s/p;
		}	
		
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Hello, I'm finally");
		}
		System.out.println("Division: "+a);	
	}

}
