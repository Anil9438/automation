package stringmethods;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="AnnA";
		System.out.println("String: "+s);
		
		StringBuffer p=new StringBuffer(s);		
		p.reverse();		
		System.out.println("String Buffer: "+p);
		
		String q=p.toString();
		
		if(s.equals(q))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}

	}

}
