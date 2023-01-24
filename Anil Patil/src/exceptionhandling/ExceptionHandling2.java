package exceptionhandling;

public class ExceptionHandling2 {
	
	int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandling2 e2=new ExceptionHandling2();
		e2.handleException(10, 0); 
	}
	
	public void handleException(int s, int p)
	{
		int z[]= {10,20,30,40};
		try
		{
			//int k=z[4]/z[1];
			a=s/p;
			int n=s/p;			
			System.out.println("Value of n: "+n);
		}	
		
		catch (Exception e)
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
