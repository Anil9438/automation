package exceptionhandling;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=50, b=2;
		int s[]= {15,25,35,45};
		int c=0, p=0;
		try
		{
			c=a/b;
			
			try
			{
				p=s[1]/s[4];
			}
			
			catch (ArithmeticException e)
			{
				e.printStackTrace();
			}
			
			finally
			{
				System.out.println("Inner Finally Block");
			}
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Outer Finally Block");
		}
		
		System.out.println("Vaue of c= "+c+" "+ "and"+" "+"Value of p="+p);

	}

}
