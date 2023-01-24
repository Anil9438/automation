package decisionmakingstatement;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//If Else Statement
		
		int a=55, b=68, c=79;
		
		System.out.println("---If Else Statement---");
		
		if ((b%2)==0)			
		{
			System.out.println(b+" is even number");
		}
		
		else			
		{
			System.out.println(b+" is odd number");
		}

		if ((a>b) && (a<c))			
		{
			System.out.println("a is smaller");
		}
		
		else			
		{
			System.out.println("a is greater");
		}

	}

}
