package stringmethods;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringMethods2 sm=new StringMethods2();
		sm.string_user();	
	}
	
	public void string_user()
	{
		String sp="Java has Compiler and Interpreter";
		System.out.println("String:" +" "+sp);		
		System.out.println("Replace a with A: " + sp.replace('a','A'));
		System.out.println("Replace e with i: " + sp.replace('e','i'));
		
		String[] dp=sp.split(" ");
		
		for(String nk:dp)
		{
			System.out.println(nk);
		}
		
		String dp1=" Anil Patil  ";
		System.out.println("Result Before Trim:"+dp1);
		System.out.println("Result After Trim:"+dp1.trim());
		
		String dp2="Java is Object Oriented and Platform Independent";
		char[] p=dp2.toCharArray();
		int count=0;	
		for (int i=0;i<p.length;i++)
		{
			if(p[i]=='O')
			{
				count++;
			}
			
		}
		System.out.println("Number of time 'O' present in String: "+count);
		
		for(char k:p)
		{
			System.out.println(k);
		}		
		
	}

}
