package exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowKeyword t=new ThrowKeyword();
		t.sum_number(25, 45);
	}
	
	public void sum_number(int a, int s)
	{
		if(a<s)
			
		try
		{
			throw new ArithmeticException();
		}
		
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		else
		{
			System.out.println("a is greater than s");
		}
	}

}
