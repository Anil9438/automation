package exceptionhandling;

public class ThrowKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowKeyword2 t1=new ThrowKeyword2();
		t1.compare_strings("Hello", "Hi");
	}
	
	public void compare_strings(String str1, String str2)
	{
		if(str1.equals(str2))
		{
			System.out.println("Strings are matching");
		}
		else
		{
			try
			{
				throw new StringNotMatchingException();
			}
			catch(StringNotMatchingException e)
			{
				e.printStackTrace();
			}
		}
	}

}